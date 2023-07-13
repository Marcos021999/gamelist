package com.ferreira.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ferreira.gamelist.entities.GameList;

public interface GameListRepository  extends JpaRepository<GameList, Long>{
    
}
