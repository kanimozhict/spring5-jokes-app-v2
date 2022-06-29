package services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class Jokeserviceimpl implements Jokeservices{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public Jokeserviceimpl() {
        this.chuckNorrisQuotes =new ChuckNorrisQuotes() ;
    }


    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
