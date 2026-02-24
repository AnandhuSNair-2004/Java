

public class stringbuffer {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter initial string: ");
		String input = sc.nextLine();
		StringBuffer sb = new StringBuffer(input);
		System.out.println("Capacity of StringBuffer: " + sb.capacity());
		sb.reverse();
		String reversedUpper = sb.toString().toUpperCase();
		System.out.println("Reversed (uppercase): " + reversedUpper);
		sb = new StringBuffer(reversedUpper);
		System.out.print("Enter string to append: ");
		String toAppend = sc.nextLine();
		sb.append(toAppend);
		System.out.println("After append: " + sb.toString());
		sc.close();
	}
}