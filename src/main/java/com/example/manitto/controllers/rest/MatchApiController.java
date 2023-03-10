package com.example.manitto.controllers.rest;

import com.example.manitto.dtos.Match;
import com.example.manitto.services.MatchService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonghyeon on 2023/01/25,
 * Package : com.example.manitto.controllers.rest
 */
@RestController
@RequestMapping("/api/match")
@RequiredArgsConstructor
public class MatchApiController {
    private final MatchService matchService;

    @GetMapping("/list")
    public List<Match.InfoDto> getMatchListActive() {
        return matchService.getMatchListActive().stream().map(Match::toInfoDto).toList();
    }
}
