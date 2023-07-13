package com.ferreira.gamelist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ferreira.gamelist.dto.GameListDTO;
import com.ferreira.gamelist.entities.GameList;
import com.ferreira.gamelist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(objGame-> new GameListDTO(objGame)).toList();
        return dto;
    }
}
