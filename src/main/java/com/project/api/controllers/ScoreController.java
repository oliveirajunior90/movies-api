package com.project.api.controllers;


import com.project.api.dto.MovieDTO;
import com.project.api.dto.ScoreDTO;
import com.project.api.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/api/v1/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public MovieDTO saveScore(@RequestBody @Validated ScoreDTO dto) {
        return scoreService.saveScore(dto);
    }
}
