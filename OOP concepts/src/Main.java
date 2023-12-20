import composition.Car;
import composition.Engine;
import encapsulation.Persoana;
import inheritance.Premiant;
import overloading.Inmultire;
import polymorphism.Anotimpuri;
import polymorphism.Iarna;
import polymorphism.Vara;

public class Main {
    public static void main(String[] args){
    Anotimpuri vara=new Vara();
    Anotimpuri iarna=new Iarna();
    vara.anotimpPreferat();
    iarna.anotimpPreferat();

        Inmultire inmultire=new Inmultire();
        inmultire.inmultire(4,6);
        inmultire.inmultire(23.00,4);
        inmultire.inmultire(1,2);

        Premiant elev=new Premiant("Marcel",12);
        elev.descrieElev();
        elev.estePremiant();

        Persoana persoana=new Persoana();
        persoana.setAge(23);
        persoana.setName("Maria");
        System.out.println("nume"+":"+persoana.getName());

        Engine motor=new Engine("motor nou");
        Car masina=new Car("Audi",motor);
        masina.pornesteMasina();


}
}