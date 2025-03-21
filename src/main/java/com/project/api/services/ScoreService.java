package com.project.api.services;

import com.project.api.dto.MovieDTO;
import com.project.api.dto.ScoreDTO;
import com.project.api.entities.Movie;
import com.project.api.entities.Score;
import com.project.api.entities.User;
import com.project.api.repositories.MovieRepository;
import com.project.api.repositories.ScoreRepository;
import com.project.api.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO dto) {

        if(dto.getScore() < 0 || dto.getScore() > 5) {
            throw new IllegalArgumentException("O Score deve ser maior ou igual a 0 ou menor ou igual a 5");
        }

        User user = userRepository.findByEmail(dto.getEmail());
        if(user == null) {
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();

        Score score = new Score();

        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        scoreRepository.saveAndFlush(score);

        float sum = 0;
        for (Score s: movie.getScores() ) {
            sum = sum + s.getValue();
        }

        float avg = sum / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());

        movieRepository.save(movie);

        return new MovieDTO(movie);
    }
}
