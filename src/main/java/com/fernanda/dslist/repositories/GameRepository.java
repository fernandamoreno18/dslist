package com.fernanda.dslist.repositories;

import com.fernanda.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> { //tipo da entidade, tipo do Id
}
