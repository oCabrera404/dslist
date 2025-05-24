package com.devsuperiot.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiot.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
