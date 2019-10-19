public class parsePractice {
   
   public static int parseNum(String nums) {
      nums = nums.replaceAll("\\+", "");
      
      nums = nums.trim();
      
      for(int i=0; i < nums.length() ; i++)  {
         if(nums.charAt(i) != '0') {
            nums = nums.substring(i);
            break;
         }
      }
      
      int n = Integer.parseInt(nums);     
      return n;  
   } 
   
   
   public static void main (String [] args) {
      String number = "+000012345";
      System.out.println("String: " + number);
      System.out.println("");

      System.out.println("Removing Leading Zeroes...");
      System.out.print("Number: " + parseNum(number));  
        
   }
} 