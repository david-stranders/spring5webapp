package nl.davidstranders.spring5webapp.model;


/**
 * Created by Dell on 30-8-2017.
 */
public class Joke {

    private String quote;

    public Joke(){}

    public Joke(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
