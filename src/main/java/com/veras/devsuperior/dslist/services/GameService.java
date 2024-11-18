package com.veras.devsuperior.dslist.services;

import com.veras.devsuperior.dslist.dto.GameDTO;
import com.veras.devsuperior.dslist.dto.GameMinDTO;
import com.veras.devsuperior.dslist.entities.Game;
import com.veras.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
//        GameDTO dto = new GameDTO(result);
        return new GameDTO(result);
    }

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
//        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return result.stream().map(x -> new GameMinDTO(x)).toList();


    }

}
