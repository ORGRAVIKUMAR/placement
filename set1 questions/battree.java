import java.util.Scanner;
public class batree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the first string: ");
        String first = sc.nextLine();     
        System.out.print("Enter the second string: ");
        String second = sc.nextLine();
        // Concatenate the strings
        String result = concatenateAndRemove(first, second);
        System.out.println("Result after concatenation and removal: " + result);
        sc.close();
    }
    public static String concatenateAndRemove(String first, String second) {
        // Check if the last character of the first string matches the first character of the second string
        if (!first.isEmpty() && !second.isEmpty() && first.charAt(first.length() - 1) == second.charAt(0)) {
            // Remove the first character of the second string
            second = second.substring(1);//0 
        }
        // Concatenate the strings and return
        return first + second;
    }
}