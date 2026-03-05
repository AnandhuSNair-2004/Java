import java.util.Scanner;

// Step 2: Interface Shape
interface Shape
{
    // Step 3: Function prototypes
    void area();
    void perimeter();
}

// Step 4: Circle class implementing Shape
class Circle implements Shape
{
    double radius;

    Circle(double r)
    {
        radius = r;
    }

    // Step 5: area calculation
    public void area()
    {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + a);
    }

    // Step 5: perimeter calculation
    public void perimeter()
    {
        double p = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle = " + p);
    }
}

// Step 6: Rectangle class implementing Shape
class Rectangle implements Shape
{
    double length, breadth;

    Rectangle(double l, double b)
    {
        length = l;
        breadth = b;
    }

    // Step 7: area calculation
    public void area()
    {
        double a = length * breadth;
        System.out.println("Area of Rectangle = " + a);
    }

    // Step 7: perimeter calculation
    public void perimeter()
    {
        double p = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle = " + p);
    }
}

// Step 8: Main class
public class shape_interface
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
            // Step 9: Menu
            System.out.println("\n1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();

                    Circle c = new Circle(r);
                    c.area();
                    c.perimeter();
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();

                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();

                    Rectangle rect = new Rectangle(l, b);
                    rect.area();
                    rect.perimeter();
                    break;

                case 3:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 3);

        sc.close();
    }
}