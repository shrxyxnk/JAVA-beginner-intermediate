public class Car{
    private String make;

    private String model;

    private String colour;

    private int doors;

    public Car(String make, String model, String colour, int doors) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.doors = doors;
    }
    public void move(){
        System.out.println("the car is "+this.make+" is moving");

    }

    public void colour(){
        System.out.println("the colour of "+this.model+" is" +this.colour);
    }

    public void turn(){
        System.out.println("the car is " +this.model +" turning.");
    }

    public void numOfDoors(){
        System.out.println("the car "+this.model+" has the number of "+this.doors);

    }
}
