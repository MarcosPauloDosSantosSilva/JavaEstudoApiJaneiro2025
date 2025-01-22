package com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
