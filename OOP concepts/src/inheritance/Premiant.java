package inheritance;

public class Premiant extends Elev {
    public Premiant(String nume,int varsta){
        super(nume, varsta);
    }
    public void estePremiant(){
        System.out.println("Elevul "+ nume + " cu varsta "+ varsta + " ani este premiant ");
    }
}
