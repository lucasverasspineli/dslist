package com.veras.devsuperior.dslist.services;

import com.veras.devsuperior.dslist.dto.GameDTO;
import com.veras.devsuperior.dslist.dto.GameListDTO;
import com.veras.devsuperior.dslist.dto.GameMinDTO;
import com.veras.devsuperior.dslist.entities.Game;
import com.veras.devsuperior.dslist.entities.GameList;
import com.veras.devsuperior.dslist.repositories.GameListRepository;
import com.veras.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
//        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
