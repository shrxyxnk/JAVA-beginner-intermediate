import java.util.Scanner;

public class Main
{
  
public static void main (String args[])
  {
	
Scanner Scanner = new Scanner (System.in);
	
 
System.out.println ("1->footaball");
	
System.out.println ("2->cricket");
	
System.out.println ("3->baseball");
	
System.out.println ("4->volleyball");
	
System.out.println ("ENTER WHICH GAME YOU WANT TO PLAY");
	
int choice = Scanner.nextInt ();
	
 
switch (choice)
	  {
		
 
case 1:
		
		  System.out.println ("you have selcted to play football");
		  break;
case 2:
		  
			System.out.println ("you have slected to play cricket");
			break;
case 3:
			
			  System.out.println ("you have slected to play baseball");
			  break;
case 4:
			  
				System.out.println ("you have slected to play volleyball");
				break;
default:
				
				  System.out.println ("YOU CHOSE TO BE LAZY AND SLEEP");
				break;
                                  
}
			  
 
 
}
			
 
 
}
