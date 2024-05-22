public class Phone {
    private String make;

    private String model;

    private String spec;

    private int manuFactYear;

    private String origin;

    public Phone(String make, String model, String spec, int manuFactYear, String origin) {
        this.make = make;
        this.model = model;
        this.spec = spec;
        this.manuFactYear = manuFactYear;
        this.origin = origin;

}

    void make(){
        System.out.println("The Brand is  "+ this.make+ "  Based in " +this.origin);
    }

    void model(){
        System.out.println("The model is "+this.model);
    }
    void spec(){
        System.out.println("the specification is "+this.spec);
    }

    void manufacture(){
        System.out.println("The year of manufacturing is "+this.manuFactYear);
    }
 void origin(){
     System.out.println("The country of origin is "+this.origin);
 }
}

