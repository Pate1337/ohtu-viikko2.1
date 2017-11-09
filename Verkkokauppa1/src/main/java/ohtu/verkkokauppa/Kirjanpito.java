
package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;

@Component
public class Kirjanpito {
//    private static Kirjanpito instance;
//    
//    public static Kirjanpito getInstance() {
//        if ( instance==null) {
//            instance = new Kirjanpito();
//        }
//        
//        return instance;
//    }
    
    private ArrayList<String> tapahtumat;

    public Kirjanpito() {
        tapahtumat = new ArrayList<String>();
    }
    
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }       
}
