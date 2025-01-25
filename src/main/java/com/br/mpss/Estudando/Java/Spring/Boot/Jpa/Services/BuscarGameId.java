package com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.DTO.GameDTO;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Entities.Game;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Repositories.GameRepository;

@Service
public class BuscarGameId {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}

}
