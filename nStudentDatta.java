import java.util.Scanner;
class Student{
    String name,usn,branch,phoneNum;
    void readData(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the student name");
        name = Scanner.next();
        System.out.println("Enter the USN of the student");
        usn = Scanner.next();
        System.out.println("Enter the Branch Name");
        branch = Scanner.next();
        System.out.println("Enter the Phone Number");
        phoneNum = Scanner.next();


    }
     void displayData(){

         System.out.println("The name of the student is "+name);
         System.out.println("The USN of the student is "+usn);
         System.out.println("The Student belongs to the Branch "+branch );
         System.out.println("The student Phone Number is "+phoneNum);

    }

}
public class Main{
    public static void main(String[] args){

        int n;
        System.out.println("Enter the number of students");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Student [] Stobj = new Student[n];
        for(int i=0;i<n;i++){
            Stobj[i]=new Student();
        }
        for(int i = 0;i<n;i++){
            Stobj[i].readData();
        }
        System.out.println("The information about the student is \n");
        for(int i=0;i<n;i++){
            Stobj[i].displayData();
        }

    }
}
