package com.hexaware.coding.service;

import java.util.List;

import com.hexaware.coding.dto.PlayerDTO;
import com.hexaware.coding.entity.Player;

public interface IPlayerService {
	
	public PlayerDTO addPlayer(PlayerDTO playerDTO);
	public PlayerDTO updatePlayer(int playerId,PlayerDTO playerDTO) throws Exception;
	public List<Player> findAll();
	public Player getMaxMatchesPlayer();
}
