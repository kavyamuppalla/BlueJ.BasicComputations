 
import java.util.Scanner;

public class ShortCalculator {


public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    short a = sc.nextShort();
    short b = sc.nextShort();
    System.out.println("Sum is" +(a + b));
    System.out.println("Difference is" +(a - b));
    System.out.println("Product is" +(a * b));
    System.out.println("Quotient is" +(a / b));
    System.out.println("Remainder is" +(a % b));
}
}