
import java.util.Scanner;

public class Shapes {

	// Area of circle (radius as double)
	public static double area(double radius) {
		return Math.PI * radius * radius;
	}

	// Area of rectangle (length and breadth as double)
	public static double area(double length, double breadth) {
		return length * breadth;
	}

	// Area of square (side as int) - overloaded by parameter type
	public static int area(int side) {
		return side * side;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose shape to compute area:");
		System.out.println("1. Circle (enter radius)");
		System.out.println("2. Rectangle (enter length and breadth)");
		System.out.println("3. Square (enter side)");
		System.out.print("Enter choice (1-3): ");
		String choiceLine = sc.nextLine().trim();
		int choice;
		try {
			choice = Integer.parseInt(choiceLine);
		} catch (Exception e) {
			System.out.println("Invalid choice. Exiting.");
			sc.close();
			return;
		}

		switch (choice) {
			case 1:
				System.out.print("Enter radius (double): ");
				double r = Double.parseDouble(sc.nextLine().trim());
				System.out.printf("Area of circle = %.4f\n", area(r));
				break;
			case 2:
				System.out.print("Enter length (double): ");
				double l = Double.parseDouble(sc.nextLine().trim());
				System.out.print("Enter breadth (double): ");
				double b = Double.parseDouble(sc.nextLine().trim());
				System.out.printf("Area of rectangle = %.4f\n", area(l, b));
				break;
			case 3:
				System.out.print("Enter side (int): ");
				int s = Integer.parseInt(sc.nextLine().trim());
				System.out.println("Area of square = " + area(s));
				break;
			default:
				System.out.println("Choice out of range. Exiting.");
		}

		sc.close();
	}
}
