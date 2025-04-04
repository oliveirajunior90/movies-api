package com.project.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    ScorePK id = new ScorePK();

    @Column(name = "score_value")
    private float value;

    public Score() {

    }

    public void setMovie(Movie movie) {
        id.setMovie(movie);
    }

    public void setUser(User user) {
        id.setUser(user);
    }

    public void setValue(float value) {
        this.value = value;
    }

    public ScorePK getId() {
        return id;
    }

    public float getValue() {
        return value;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

}
