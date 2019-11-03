package br.com.emc.chucknorrisjokes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.emc.chucknorrisjokes.service.ChuckNorrisJokesService;

/*
 * Provides the services related to Chuck Norris quotes.
 */
@Controller
public class ChuckNorrisJokesController {

	private ChuckNorrisJokesService chuckNorrisJokesService;
	
	/*
	 * Standard constructor.
	 */
	public ChuckNorrisJokesController(ChuckNorrisJokesService chuckNorrisJokesService) {
		super();
		this.chuckNorrisJokesService = chuckNorrisJokesService;
	}

	/*
	 * Get a random Chuck Norris quote.
	 */
	@GetMapping
	public String getRandomQuote(Model model) {
		model.addAttribute("quote", chuckNorrisJokesService.getRandomJoke());
		return "chucknorris";
	}

}
