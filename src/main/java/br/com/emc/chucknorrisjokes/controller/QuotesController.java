package br.com.emc.chucknorrisjokes.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.emc.chucknorrisjokes.service.ChuckNorrisJokesService;

@RestController
@RequestMapping("/quote")
public class QuotesController {
	
	private final ChuckNorrisJokesService chuckNorrisJokesService;

	public QuotesController(ChuckNorrisJokesService chuckNorrisJokesService) {
		super();
		this.chuckNorrisJokesService = chuckNorrisJokesService;
	}

	@GetMapping
	public String getRandomQuote(Model model) {
		return chuckNorrisJokesService.getRandomJoke();
	}
	
}
