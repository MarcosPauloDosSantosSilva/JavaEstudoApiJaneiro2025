package com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.DTO.GameDTO;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Entities.Game;
import com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Services.GameService;

@RestController
@RequestMapping(value = "/gamesid")
public class GameIdController {
	
	@Autowired
	private com.br.mpss.Estudando.Java.Spring.Boot.Jpa.Services.BuscarGameId gameId;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gameId.findById(id);
				return result;
		
	}
		
}
