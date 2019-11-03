package br.com.emc.chucknorrisjokes.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/*
 * Get quotes from Chuck Norris.
 */
@Service
public class ChuckNorrisJokesService {

	ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
	
	/*
	 * Get a random Chuck Norris quote.
	 */
	public String getRandomJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
	
}