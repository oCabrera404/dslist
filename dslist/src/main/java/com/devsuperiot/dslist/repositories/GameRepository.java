package com.devsuperiot.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiot.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
