package com.project.api.dto;

public class ScoreDTO {
    private Long movieId;
    private String email;
    private float score;

    public ScoreDTO() {

    }

    public void setId(Long movieId) {
        this.movieId = movieId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getEmail() {
        return email;
    }

    public float getScore() {
        return score;
    }
}
