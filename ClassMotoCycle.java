public class MotoCycle {

    private String make;

    private String model;

    private int displacement;

    private String origin;

    public MotoCycle(String make, String model, int displacement, String origin) {
        this.make = make;
        this.model = model;
        this.displacement = displacement;
        this.origin = origin;
    }

    void model(){
        System.out.println("The Motorcycle Model name is " +this.model );
    }

    void make(){
        System.out.println("The Brand is "+this.make);
    }

    void displacement(){
        System.out.println("The displacement is "+this.displacement );
    }

    void origin(){

        System.out.println("The origin of the motorcycle is "+this.origin);
    }

}
