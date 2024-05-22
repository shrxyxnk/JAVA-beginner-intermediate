public class Human {

    private String name;

    private String skinColor;

    private String race;

    private String persona;

    private float height;

    public Human(String name, String skinColor, String race, String persona, float height) {
        this.name = name;
        this.skinColor = skinColor;
        this.race = race;
        this.persona = persona;
        this.height = height;
    }

    void name(){
        System.out.println("The name of the person is"+this.name);
    }

    void race(){
        System.out.println("The ethnic race of "+ this.name+ " is"+this.race);
    }

            void persona()
            {
                System.out.println("The physical personality of "+this.name+" is"+this.persona);
            }

            void color(){
                System.out.println("The color of the person is "+this.skinColor);
            }


     void height() {
        System.out.println("The height of the person is "+ this.height);
    }
}

