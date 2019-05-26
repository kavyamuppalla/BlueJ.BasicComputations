 
import java.util.Scanner;

import java.math.BigInteger;

public class Factorial {
    //int factorial = 1;
    public int ONE = 1;
    
    public BigInteger factorialOf(Integer value){
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i<=value; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        //return factorial;
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial : ");
        int number = sc.nextInt();
        
        Factorial fact = new Factorial();
        fact.factorialOf(number);
        BigInteger bigfactorial = fact.factorialOf(number);
        System.out.println("Factorial :" +bigfactorial);
        
    }
}
