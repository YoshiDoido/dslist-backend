package com.gabrielyoshino.dslist.repositories;

import com.gabrielyoshino.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
