package com.springrest.springrest.contoller;
import java.util.*;


import org.springframework.web.bind.annotation.*;

import com.springrest.springrest.entities.PlayerStatistics;
import com.springrest.springrest.services.PlayerStatisticsService;


@RestController
@RequestMapping("/fifa/api/v1/statistics")
public class MyController {
	private final PlayerStatisticsService playerStatisticsService;

    public MyController(PlayerStatisticsService playerStatisticsService) {
        this.playerStatisticsService = playerStatisticsService;
    }

    @GetMapping("/get-all-details")
    public List<PlayerStatistics> getAllPlayerStatistics() {
        return playerStatisticsService.getAllPlayerStatistics();
    }

    @GetMapping("/get-by-id/{playerId}")
    public PlayerStatistics getPlayerStatisticsById(@PathVariable Long playerId) {
        return playerStatisticsService.getPlayerStatisticsById(playerId);
    }

    @GetMapping("/apply-filter")
    public List<PlayerStatistics> getPlayerStatisticsWithFilter(
            @RequestParam(required = false) Integer minGamesPlayed,
            @RequestParam(required = false) Integer minMinutesPlayed,
            @RequestParam(required = false) Integer minGoalsScored,
            @RequestParam(required = false) Integer birthYear) {
        return playerStatisticsService.getPlayerStatisticsWithFilter(minGamesPlayed, minMinutesPlayed, minGoalsScored, birthYear);
    }

}
