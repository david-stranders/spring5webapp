package nl.davidstranders.spring5webapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import nl.davidstranders.spring5webapp.model.Joke;
import org.springframework.stereotype.Service;

/**
 * Created by Dell on 30-8-2017.
 */
@Service
public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes =  new ChuckNorrisQuotes();
    }

    @Override
    public Joke getJoke() {
        Joke joke = new Joke(chuckNorrisQuotes.getRandomQuote());
        return joke;
    }
}
