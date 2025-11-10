package br.com.emc.chucknorrisjokes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.emc.chucknorrisjokes.service.ChuckNorrisJokesService;

@Controller
public class ChuckNorrisJokesController {

	private ChuckNorrisJokesService chuckNorrisJokesService;

	public ChuckNorrisJokesController(ChuckNorrisJokesService chuckNorrisJokesService) {
		super();
		this.chuckNorrisJokesService = chuckNorrisJokesService;
	}

	@GetMapping
	public String getRandomQuote(Model model) {
		model.addAttribute("quote", chuckNorrisJokesService.getRandomJoke());
		return "chucknorris";
	}

}
