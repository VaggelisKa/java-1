import java.util.Scanner;

 class Main {
    static void isPalindrome(String original) {
        String reversed = "";
        String originalWithoutSpacesAndTabs = original.replaceAll("\\s+", "");

        int length = originalWithoutSpacesAndTabs.length();
        for ( int i = length - 1; i >= 0; i-- ) {
             reversed = reversed + originalWithoutSpacesAndTabs.charAt(i);
        }

        if (areWordsEqual(originalWithoutSpacesAndTabs, reversed)) {
             System.out.println("'" + original + "'"+ " is a palindrome.");
        } else {
             System.out.println("'" + original + "'"+" isn't a palindrome.");
        }
    }

    private static boolean areWordsEqual(String original, String reversed) {
        String lowerCasedOriginal = original.toLowerCase();
        String lowerCasedReversed = reversed.toLowerCase();

        return lowerCasedOriginal.equals(lowerCasedReversed);
    }

   public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter number of elements you want to check");

        int numberOfPhrasesToCheck = Integer.parseInt(in.nextLine());

        System.out.println("Please enter the strings to check if it is a palindrome");

        for (int k = 0; k < numberOfPhrasesToCheck; k++) {
            String phraseToBeChecked = in.nextLine();
            isPalindrome(phraseToBeChecked);
        }
   }  
}    
	 
	  
   