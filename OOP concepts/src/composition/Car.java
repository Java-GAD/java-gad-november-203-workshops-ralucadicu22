package composition;

public class Car {
    private String model;
    private Engine motor;
    public Car(String model,Engine motor){
        this.model=model;
        this.motor=motor;

    }
    public void pornesteMasina(){
        System.out.println(model);
        motor.porneste();
    }
}
