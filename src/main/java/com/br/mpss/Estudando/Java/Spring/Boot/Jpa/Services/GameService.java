package com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.DTO.GameMinDTO;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Entities.Game;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll(){
		List<Game> result = gameRepository.findAll();
		return result;
		
	}

}
