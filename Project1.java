import java.util.Scanner;
public class Project1 
{ 
   public static void main(String args[] ) 
   { 
       Scanner sc  = new Scanner(System.in); 
    String key;
       do {
    System.out.println("Enter the number whose number to be raised to a power:");
    Long n = sc.nextLong(); 
    System.out.println("The power of the number:"); 
    Long m =sc.nextLong(); 
    double d = Math.pow(n,m); 
    double t = d/n; 
     
        System.out.println(d+" "+"is the power of the number"+" "+n+"."); 
    
  System.out.print("Type 'c' to continue or 'q' to quit: ");
            key = sc.next();
        } while (key.equalsIgnoreCase("c")); // Keyword to CONTINUE
    } 
}