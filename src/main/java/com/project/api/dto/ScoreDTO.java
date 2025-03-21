package com.project.api.dto;

import jakarta.validation.constraints.*;

public class ScoreDTO {

    @NotNull
    private Long movieId;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Min(0)
    @Max(5)
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
