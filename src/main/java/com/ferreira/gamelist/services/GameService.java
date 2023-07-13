package com.ferreira.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreira.gamelist.entities.Game;
import com.ferreira.gamelist.dto.GameMinDTO;
import com.ferreira.gamelist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(objGame-> new GameMinDTO(objGame)).toList();
        return dto;
    }
}
