

import java.util.Scanner;   

 public class Main  
{  
static void isPalindrome(String original){
	String reverse = "";
	String originalnew = original.replaceAll("[\\n\\t ]", "");
	int length = originalnew.length();
	 for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + originalnew.charAt(i);  
      if (originalnew.toLowerCase().equals(reverse.toLowerCase()))  
         System.out.println("'" + original + "'"+ " is a palindrome.");  
      else  
         System.out.println("'" + original + "'"+" isn't a palindrome.");
	
}

   public static void main(String args[])  
   {  
      
      Scanner in = new Scanner(System.in);   
	  
	  
	 System.out.println("enter number of elements you want to check");

    int n = in.nextInt();
	  
	String[] array = new String[n];

    System.out.println("Please enter the strings to check if it is a palindrome");

    for (int k = 0; k < array.length; k++) {
	 String original = in.nextLine();
         array[k] = original;	   
	   isPalindrome(array[k]);
	  
	  
    }
	  
	  
	  
	  
      
         
   }  
}    
	 
	  
   