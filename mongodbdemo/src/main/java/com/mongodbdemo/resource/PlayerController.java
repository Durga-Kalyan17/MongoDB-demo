package com.mongodbdemo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodbdemo.exception.ResourceNotFoundExceptionWithId;
import com.mongodbdemo.model.Player;
import com.mongodbdemo.repository.PlayerRepository;

import jakarta.validation.Valid;

//import jakarta.validation.Valid;

/**
 * @author DurgaKalyan
 * 
 */
@RestController
@RequestMapping("/players")
public class PlayerController {

	@Autowired
	private PlayerRepository repository;
	
	/**
	 * @PostMapping annotation to add players in DB
	 * @param player
	 * 
	 */
	@PostMapping("/add")
	public String savePlayer(@RequestBody @Valid Player player) {
		/*
		 * repository.save(player); System.out.println(repository.save(player));
		 * 
		 */
		System.out.println("-------------------");
		return "Added Player to DB with id : "+player.getId();
	}
	
	/**
	 * @GetMapping annotation to get all players from DB
	 * 
	 */
	@GetMapping("/getall")
	public List<Player> getPlayers(){
		return repository.findAll();
	}
	
	/**
	 * @GetMapping annotation to get player by id from DB
	 * @param id
	 * @throws ResourceNotFoundException 
	 * 
	 */
	@GetMapping("/get/{id}")
	@ExceptionHandler(ResourceNotFoundExceptionWithId.class)
	public Optional<Player> getPlayerById(@PathVariable int id) throws ResourceNotFoundExceptionWithId {
		Optional<Player> player = repository.findById(id);
		/*
		 * if(player != null) return repository.findById(id);
		 */
		if(player == null)
			throw new ResourceNotFoundExceptionWithId("Player not Found with id : "+id);
		return repository.findById(id);
	}
	
	/**
	 * @DeleteMapping annotation to delete player by id from DB
	 * @param id
	 * 
	 */
	@DeleteMapping("/delete/{id}")
	public String deletePlayer(@PathVariable @Valid int id) {
		repository.deleteById(id);
		return "Player with id : "+id+" deleted";
	}
}
