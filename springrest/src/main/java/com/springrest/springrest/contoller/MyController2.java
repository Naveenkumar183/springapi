package com.springrest.springrest.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springrest.springrest.entities.PlayerDefenseData;
import com.springrest.springrest.services.PlayerDefenseService;
import java.util.List;

public class MyController2 {
	private final PlayerDefenseService playerDefenseService;

    public MyController2(PlayerDefenseService playerDefenseService) {
        this.playerDefenseService = playerDefenseService;
    }

    @GetMapping("/get-all-details")
    public List<PlayerDefenseData> getAllPlayerDefenseData() {
        return playerDefenseService.getAllPlayerDefenseData();
    }

    @GetMapping("/get-by-id/{playerId}")
    public PlayerDefenseData getPlayerDefenseDataById(@PathVariable Long playerId) {
        return playerDefenseService.getPlayerDefenseDataById(playerId);
    }

    @GetMapping("/apply-filter")
    public List<PlayerDefenseData> getPlayerDefenseDataWithFilter(
            @RequestParam(required = false) String position,
            @RequestParam(required = false) String team,
            @RequestParam(required = false) Integer minTackles,
            @RequestParam(required = false) Integer minTacklesWon) {
        return playerDefenseService.getPlayerDefenseDataWithFilter(position, team, minTackles, minTacklesWon);
    }
}
