package com.hexaware.coding.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.coding.dto.PlayerDTO;
import com.hexaware.coding.entity.Player;
import com.hexaware.coding.repository.PlayerRepository;
@Service
public class PlayerServiceImpl implements IPlayerService {
	@Autowired
	PlayerRepository playerRepository;

	@Override
	public PlayerDTO addPlayer(PlayerDTO playerDTO) {
		Player player = new Player();
		BeanUtils.copyProperties(playerDTO, player);
		player = playerRepository.save(player);
		BeanUtils.copyProperties(player, playerDTO);
		return playerDTO;
	}

	@Override
	public List<Player> findAll() {
		 List<Player> players = playerRepository.findAll();
		return players;
	}
	
	@Override
	public Player getMaxMatchesPlayer() {
		return playerRepository.getMaxMatchesPlayer();
		
	}

	@Override
	public PlayerDTO updatePlayer(int id,PlayerDTO playerDTO) throws Exception {
		Optional<Player> player = playerRepository.findById(id);
		if(player.isPresent()) {
			Player updatePlayer = player.get();
			BeanUtils.copyProperties(playerDTO, updatePlayer);
			updatePlayer.setPlayerId(id);
			updatePlayer = playerRepository.save(updatePlayer);
			BeanUtils.copyProperties(updatePlayer, playerDTO);
		}
		
		else {
			throw new Exception ("player not found");
		}
	
		
		
		return playerDTO;
		
	}

}
