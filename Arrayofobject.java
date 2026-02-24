
import java.util.Scanner;

public class Arrayofobject {
	static class Employee {
		int eNo;
		String eName;
		double eSalary;

		Employee(int eNo, String eName, double eSalary) {
			this.eNo = eNo;
			this.eName = eName;
			this.eSalary = eSalary;
		}

		@Override
		public String toString() {
			return "Employee No: " + eNo + ", Name: " + eName + ", Salary: " + eSalary;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of employees: ");
		int n = 0;
		try {
			n = Integer.parseInt(sc.nextLine().trim());
		} catch (Exception ex) {
			System.out.println("Invalid number. Exiting.");
			sc.close();
			return;
		}

		if (n <= 0) {
			System.out.println("No employees to read. Exiting.");
			sc.close();
			return;
		}

		Employee[] list = new Employee[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter details for employee " + (i + 1) + ":");
			System.out.print("  eNo (int): ");
			int eNo = Integer.parseInt(sc.nextLine().trim());
			System.out.print("  eName: ");
			String eName = sc.nextLine();
			System.out.print("  eSalary (number): ");
			double eSalary = Double.parseDouble(sc.nextLine().trim());
			list[i] = new Employee(eNo, eName, eSalary);
		}

		System.out.print("Enter employee number to search: ");
		int searchNo = Integer.parseInt(sc.nextLine().trim());

		Employee found = null;
		for (Employee e : list) {
			if (e.eNo == searchNo) {
				found = e;
				break;
			}
		}

		if (found != null) {
			System.out.println("Employee found:");
			System.out.println(found);
		} else {
			System.out.println("Employee with eNo " + searchNo + " not found.");
		}

		sc.close();
	}
}
