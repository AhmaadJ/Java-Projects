import java.util.Scanner;

public class GeoSumCalculator {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.print("Enter a(If a is a fraction, enter as decimal): ");
      double a = scnr.nextDouble();
      System.out.print("Enter r(If r is a fraction, enter as decimal): ");
      double r = scnr.nextDouble();

      System.out.print("Enter u(upper limit of summation): ");
      int u = scnr.nextInt();
      System.out.print("Enter k(index of summation): ");
      int k = scnr.nextInt();
      
      
      double sum = 0;
      for(int i = k; i <= u; i++) {
         double term = (Math.pow(r, i));   //change depending on the term equation
         sum = sum + term;
      }
      System.out.println("Geometric Sum = " + sum);
        
   }
}   

//(Math.pow(r, i))
//(Math.pow(a, r*i)