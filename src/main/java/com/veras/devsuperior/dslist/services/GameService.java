package com.veras.devsuperior.dslist.services;

import com.veras.devsuperior.dslist.dto.GameMinDTO;
import com.veras.devsuperior.dslist.entities.Game;
import com.veras.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
//        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return result.stream().map(x -> new GameMinDTO(x)).toList();


    }

}
