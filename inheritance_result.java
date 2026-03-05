import java.util.Scanner;

// Step 2: Student class
class Student
{
    int roll_no;
    String name;
    int academic_score;

    // Step 3: method to read student details
    void readStudent(Scanner sc)
    {
        System.out.print("Enter Roll No: ");
        roll_no = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Academic Score: ");
        academic_score = sc.nextInt();
    }
}

// Step 4: Sports interface
interface Sports
{
    int sports_score = 0;

    void readSports(Scanner sc);
}

// Step 6: Result class inheriting Student and Sports
class Result extends Student implements Sports
{
    int sports_score;

    // Step 5: method to read sports score
    public void readSports(Scanner sc)
    {
        System.out.print("Enter Sports Score: ");
        sports_score = sc.nextInt();
    }

    // Step 7: display method
    void display()
    {
        System.out.println("\nStudent Result");
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Academic Score: " + academic_score);
        System.out.println("Sports Score: " + sports_score);
    }
}

// Step 8: Main class
public class inheritance_result
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Step 9: create object
        Result r = new Result();

        // Step 10: read details
        r.readStudent(sc);
        r.readSports(sc);

        // Step 11: display result
        r.display();

        sc.close();
    }
}