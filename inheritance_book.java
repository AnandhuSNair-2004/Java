import java.util.Scanner;

// Publisher class
class Publisher {
    String publisher_name;
}

// Book class inheriting Publisher
class Book extends Publisher {
    String book_name;
    String author;
}

// Literature class inheriting Book
class Literature extends Book {
    String type;

    void read(Scanner sc) {
        System.out.print("Publisher Name: ");
        publisher_name = sc.nextLine();

        System.out.print("Book Name: ");
        book_name = sc.nextLine();

        System.out.print("Author: ");
        author = sc.nextLine();

        System.out.print("Literature Type: ");
        type = sc.nextLine();
    }

    void display() {
        System.out.println("\nPublisher: " + publisher_name);
        System.out.println("Book Name: " + book_name);
        System.out.println("Author: " + author);
        System.out.println("Category: Literature - " + type);
    }
}

// Fiction class inheriting Book
class Fiction extends Book {
    String type;

    void read(Scanner sc) {
        System.out.print("Publisher Name: ");
        publisher_name = sc.nextLine();

        System.out.print("Book Name: ");
        book_name = sc.nextLine();

        System.out.print("Author: ");
        author = sc.nextLine();

        System.out.print("Fiction Type: ");
        type = sc.nextLine();
    }

    void display() {
        System.out.println("\nPublisher: " + publisher_name);
        System.out.println("Book Name: " + book_name);
        System.out.println("Author: " + author);
        System.out.println("Category: Fiction - " + type);
    }
}

// Main class
public class inheritance_book {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++) {

            System.out.print("\nEnter category (1-Literature, 2-Fiction): ");
            int ch = sc.nextInt();
            sc.nextLine();

            if(ch==1) {
                Literature l = new Literature();
                l.read(sc);
                l.display();
            }

            else if(ch==2) {
                Fiction f = new Fiction();
                f.read(sc);
                f.display();
            }

            else {
                System.out.println("Invalid category");
            }
        }

        sc.close();
    }
}