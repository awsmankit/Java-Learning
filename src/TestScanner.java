/*
Write java application to accept int (emp id), double (salary), 
emp first name, is permanent,: boolean from scanner & display 
*/
import java.util.Scanner;

public class TestScanner {

     public static void main (String[] args)
     {
     // create a scanner object, wrapping stdin
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter emp id, Salary , Name permanent status");
    System.out.printf("Emp id %d Salary %.2f Name %s Is Permanent %b %n", 
    sc.nextInt(), sc.nextDouble(),sc.next(),sc.nextBoolean());
    // Close the scanner
    sc.close();
     }
     
}
