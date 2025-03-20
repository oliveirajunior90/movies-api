package com.project.api.services;

import com.project.api.dto.MovieDTO;
import com.project.api.entities.Movie;
import com.project.api.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = repository.findAll(pageable);
        return result.map(MovieDTO::new);
    };

    public List<Movie> findAll() {
        return repository.findAll();
    }

    public Optional<MovieDTO> findById(Long id) {
        var result = repository.findById(id);

        return result.stream().map(MovieDTO::new).findFirst();
    }
}
