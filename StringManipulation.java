import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string (for concatenation): ");
        String str2 = sc.nextLine();

        // i. Length
        System.out.println("Length of first string : " + str1.length());

        // ii. 2nd and 4th character
        if (str1.length() >= 4) {
            System.out.println("2nd character: " + str1.charAt(1));
            System.out.println("4th character: " + str1.charAt(3));
        }

        // iii. Substring using start index only
        if (str1.length() > 2) {
            System.out.println("Substring from index 2: " + str1.substring(2));
        }

        // iv. Substring using start and end index
        if (str1.length() >= 5) {
            System.out.println("Substring (1,5): " + str1.substring(1, 5));
        }

        // v. Concatenation
        System.out.println("Concatenation: " + str1.concat(str2));

        // vi. Lowercase
        System.out.println("Lowercase: " + str1.toLowerCase());

        // vii. Uppercase
        System.out.println("Uppercase: " + str1.toUpperCase());

        sc.close();
    }
}