package com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.DTO.GameListDTO;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Entities.GameList;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
		
		
	}

}
