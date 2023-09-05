package com.mouramateus.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouramateus.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
