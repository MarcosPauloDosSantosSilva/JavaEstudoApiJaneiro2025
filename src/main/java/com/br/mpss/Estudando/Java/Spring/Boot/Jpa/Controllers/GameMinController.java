package com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.DTO.GameMinDTO;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Entities.Game;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Services.GameMinDto;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Services.GameService;

@RestController
@RequestMapping(value = "/gamesmin")
public class GameMinController {
	
	@Autowired
	private GameMinDto gameDto;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO>findAll(){
		List<GameMinDTO> result = gameDto.findAll();
		return result;
		
	}

}
