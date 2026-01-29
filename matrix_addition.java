import java.util.Scanner;

class MatrixAddition {
    int r, c;
    int[][] a, b, sum;

    void readMatrices() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        r = sc.nextInt();

        System.out.println("Enter number of columns:");
        c = sc.nextInt();

        a = new int[r][c];
        b = new int[r][c];
        sum = new int[r][c];

        System.out.println("Enter the elements of first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void addMatrices() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    void displaySum() {
        System.out.println("Sum of matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixAddition obj = new MatrixAddition();
        obj.readMatrices();
        obj.addMatrices();
        obj.displaySum();
    }
}
