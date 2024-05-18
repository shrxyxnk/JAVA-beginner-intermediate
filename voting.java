public class Main {
    public static void main(String args[]) {
        int age=17;
        if(age>=18){
        System.out.println("you are eligible to vote");
        System.out.println("please put an X in the ballot");
        } 
        if((18-age)==1){

            System.out.println("you can vote in " + (18-age) + " year");
        }

        else{

     System.out.println("you are ineligible to vote please come back in \n"+ ( 18- age) +  " years");
        }
    }
}
