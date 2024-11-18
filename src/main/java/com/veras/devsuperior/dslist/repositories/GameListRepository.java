package com.veras.devsuperior.dslist.repositories;

import com.veras.devsuperior.dslist.entities.Game;
import com.veras.devsuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {



}
