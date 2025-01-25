package com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.DTO.GameListDTO;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Services.GameListService;

@RestController
@RequestMapping(value = "/gameslist")
public class GameListController {
	
	@Autowired
	private GameListService gamesListService;
	
	@GetMapping
	public List<GameListDTO>findAll(){
		List<GameListDTO> result = gamesListService.findAll();
		return result;
		
	}
	
	
	
	

}
