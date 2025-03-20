package com.project.api.repositories;

import com.project.api.entities.Score;
import com.project.api.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository  extends JpaRepository<Score, ScorePK> {

}
