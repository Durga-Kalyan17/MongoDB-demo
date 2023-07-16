package com.movies.repository;

import com.movies.entities.IMDbIdList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMDbRepository extends JpaRepository<IMDbIdList, Long>{

}
