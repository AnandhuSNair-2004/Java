import java.util.Arrays;
import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// i. Check palindrome
		System.out.print("Enter a string to check palindrome: ");
		String s = sc.nextLine();
		String cleaned = s.replaceAll("\\s+", "").toLowerCase();
		String rev = new StringBuilder(cleaned).reverse().toString();
		if (cleaned.equals(rev)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}

		// ii. Sort a given list of names in ascending order
		System.out.print("Enter number of names: ");
		int n = 0;
		try {
			n = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Invalid number, assuming 0.");
			n = 0;
		}

		String[] names = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter name " + (i + 1) + ": ");
			names[i] = sc.nextLine();
		}

		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Sorted names in ascending order:");
		for (String name : names) {
			System.out.println(name);
		}

		sc.close();
	}
}
