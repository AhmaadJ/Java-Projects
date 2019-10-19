public class LeibnizSeries {
   
   public static void lebniz(int n)   {
      double sum = 0;
      for(int i = 0; i < n; i++) {
         double term = (Math.pow(-1, i)) / ((2*i)+ 1);
         sum = 4 * term;
         //System.out.println("Term " + i + " = " + String.format( "%.3f", sum) );  prints every partial sum
      } 
      System.out.println("Last Term = " + String.format( "%.6f", sum) );  
      
      double ans = Math.abs(sum-Math.PI);
      
      if(ans < 0.000001) {
         System.out.println("Sum = " + String.format( "%.6f", ans) + ". True"); 
      }
      if(ans >= 0.000001) {
         System.out.println("Sum = " + String.format( "%.6f", ans) + ". False"); 
      } 
            
   }
   
   public static void machin(int k) {
     double sum = 0;
      for(int i = 0; i < k; i++) {
         double term = (Math.pow(-1, i)) / ((2*i)+ 1);
         double fullTerm = term * (4*(Math.pow(1/5, (2*i)+1)) - (Math.pow(1/239, (2*i)+1)) ); 
         sum = 4 * fullTerm;
        // System.out.println("Term " + i + " = " + String.format( "%.10f", sum) );
      } 
      System.out.println("Last Term = " + String.format( "%.10f", sum) );        
   }  //Incorrect, supposed to converge to pi not zero
 
   
   
   public static void main(String[] Args) {
      
      int lastTerm = 11;
      System.out.println("Lebniz-Madhava Series:");
      lebniz(lastTerm); 
      System.out.println("");
       
       
      //System.out.println("Machin's Series:");
      //machin(lastTerm); 
   } 
}