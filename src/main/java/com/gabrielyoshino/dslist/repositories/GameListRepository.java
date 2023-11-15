package com.gabrielyoshino.dslist.repositories;

import com.gabrielyoshino.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
