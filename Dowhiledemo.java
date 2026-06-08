import java.util.Scanner;
public class Dowhiledemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Welcome java!!");
            System.out.println("Enter 1 to continue, o to exit the program");
            n = sc.nextInt();
        } while (n == 1);
        System.out.println("Program ended");
        sc.close();
    }
    }