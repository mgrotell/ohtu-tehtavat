package ohtu.verkkokauppa;

public class Viitegeneraattori implements ViiteheneraattoriInterface {

    private static Viitegeneraattori instanssi;
    
    private int seuraava;
    
    public Viitegeneraattori(){
        this.seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
