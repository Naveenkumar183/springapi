package com.springrest.springrest.services;
import java.util.*;

import com.springrest.springrest.dao.PlayerStatisticsDao;
import com.springrest.springrest.entities.PlayerStatistics;

public class PlayerStatisticsService {
	private final PlayerStatisticsDao playerStatisticsDao;

    public PlayerStatisticsService(PlayerStatisticsDao playerStatisticsDao) {
        this.playerStatisticsDao = playerStatisticsDao;
    }

    public List<PlayerStatistics> getAllPlayerStatistics() {
        return playerStatisticsDao.findAll();
    }

    public PlayerStatistics getPlayerStatisticsById(Long playerId) {
        return playerStatisticsDao.findById(playerId)
                .orElseThrow(() -> new PlayerStatisticsNotFoundException(playerId));
    }

    public List<PlayerStatistics> getPlayerStatisticsWithFilter(Integer minGamesPlayed,
                                                                Integer minMinutesPlayed,
                                                                Integer minGoalsScored,
                                                                Integer birthYear) {
        return playerStatisticsDao.findByFilter(minGamesPlayed, minMinutesPlayed, minGoalsScored, birthYear);
}
