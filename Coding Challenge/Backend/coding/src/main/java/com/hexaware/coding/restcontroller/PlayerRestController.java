package com.hexaware.coding.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.coding.dto.PlayerDTO;
import com.hexaware.coding.entity.Player;
import com.hexaware.coding.service.IPlayerService;

@RestController
@CrossOrigin
@RequestMapping("/api/players")
public class PlayerRestController {
	
	@Autowired
	IPlayerService playerService;
	
	
	@PostMapping("/add")
	public PlayerDTO addPlayer(@RequestBody PlayerDTO playerDTO) {
		return playerService.addPlayer(playerDTO);
	}
	
	@PutMapping("/put/{id}")
	//public PlayerDTO updatePlayer(@PathVariable int id,@RequestBody PlayerDTO playerDTO) throws Exception {
	//	return playerService.updatePlayer(id,playerDTO);
	
	 public ResponseEntity<PlayerDTO> updatePlayer(@PathVariable("id") int playerId, @RequestBody PlayerDTO updatedPlayerDTO) throws Exception {
        PlayerDTO updatedPlayer = playerService.updatePlayer(playerId, updatedPlayerDTO);
        return ResponseEntity.ok(updatedPlayer);
	}
	
	
	@GetMapping("/getall")
	List<Player>  findAll() {
		return playerService.findAll();
	}
	
	@GetMapping("/getallnames")
	public Player getMaxScorePlayer() {
		return playerService.getMaxMatchesPlayer();
	}

}
