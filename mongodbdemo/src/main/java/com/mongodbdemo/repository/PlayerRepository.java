package com.mongodbdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodbdemo.model.Player;

/**
 * @author DurgaKalyan
 * 
 */
@Repository
public interface PlayerRepository extends MongoRepository<Player, Integer> {

}
