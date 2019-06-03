package stringreverser;
import java.util.Scanner;

/**
 *
 * @author Zef Foster
 */
public class StringReverser {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //creates a scanner object
        
        System.out.println("Input a string, and the program will reverse it for you: ");
        
        String input = sc.nextLine();
        int length = input.length();
        String reverse = "";
        
        for (int i = length - 1 ; i >= 0 ; i--)
         reverse = reverse + input.charAt(i);
        
        
        //String delims = "[,]";
        //String[] tokens = input.split(delims);
        
        System.out.println(reverse);
    }
    
}
