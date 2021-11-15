package ohtu.verkkokauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Viitegeneraattori implements ViiteheneraattoriInterface {

    private static Viitegeneraattori instanssi;
    
    private int seuraava;
    
    @Autowired
    public Viitegeneraattori(){
        this.seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
