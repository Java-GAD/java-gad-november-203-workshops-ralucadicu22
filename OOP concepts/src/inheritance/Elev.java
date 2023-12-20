package inheritance;

import org.w3c.dom.ls.LSOutput;

public class Elev {
    String nume;
    int varsta;
     public Elev(String nume, int varsta){
        this.nume=nume;
        this.varsta=varsta;
    }
    public void descrieElev(){
        System.out.println("Elevul "+ nume + " are " + varsta + " ani");
    }

}
