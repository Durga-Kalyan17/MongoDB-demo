package com.mongodbdemo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodbdemo.model.Player;
import com.mongodbdemo.repository.PlayerRepository;

/**
 * @author DurgaKalyan
 * 
 */
@RestController
public class PlayerController {

	@Autowired
	private PlayerRepository repository;
	
	/**
	 * @PostMapping annotation to add players in DB
	 * @param player
	 * 
	 */
	@PostMapping("/addPlayer")
	public String savePlayer(@RequestBody Player player) {
		repository.save(player);
		return "Added Player to DB with id : "+player.getId();
	}
	
	/**
	 * @GetMapping annotation to get all players from DB
	 * 
	 */
	@GetMapping("/getAllPlayers")
	public List<Player> getPlayers(){
		return repository.findAll();
	}
	
	/**
	 * @GetMapping annotation to get player by id from DB
	 * @param id
	 * 
	 */
	@GetMapping("/getPlayer/{id}")
	public Optional<Player> getPlayerById(@PathVariable int id){
		return repository.findById(id);
	}
	
	/**
	 * @DeleteMapping annotation to delete player by id from DB
	 * @param id
	 * 
	 */
	@DeleteMapping("/delete/{id}")
	public String deletePlayer(@PathVariable int id) {
		repository.deleteById(id);
		return "Player with id : "+id+" deleted";
	}
}
