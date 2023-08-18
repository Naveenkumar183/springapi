package com.springrest.springrest.services;

import com.springrest.springrest.dao.PlayerDefenseDao;
import com.springrest.springrest.entities.PlayerDefenseData;
import java.util.List;

public class PlayerDefenseService {
	 private final PlayerDefenseDao playerDefenseDao;

	    public PlayerDefenseService(PlayerDefenseDao playerDefenseDao) {
	        this.playerDefenseDao = playerDefenseDao;
	    }

	    public List<PlayerDefenseData> getAllPlayerDefenseData() {
	        return playerDefenseDao.findAll();
	    }

	    public PlayerDefenseData getPlayerDefenseDataById(Long playerId) {
	        return playerDefenseDao.findById(playerId)
	                .orElseThrow(() -> new PlayerDefenseDataNotFoundException(playerId));
	    }

	    public List<PlayerDefenseData> getPlayerDefenseDataWithFilter(String position,
	                                                                  String team,
	                                                                  Integer minTackles,
	                                                                  Integer minTacklesWon) {
	        return playerDefenseDao.findByFilter(position, team, minTackles, minTacklesWon);
	    }
}
