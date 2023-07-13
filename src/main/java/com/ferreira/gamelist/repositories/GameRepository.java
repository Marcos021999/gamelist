package com.ferreira.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferreira.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
