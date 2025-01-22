package com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Entities.Game;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Repositories.GameRepository;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<Game>findAll(){
		List<Game> result = gameService.findAll();
		return result;
		
	}

}
