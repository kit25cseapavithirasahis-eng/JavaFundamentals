import java.util.Scanner;
public class Stringsdemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hiii.......welcome to java programming "+ name);
        sc.close();
    }
}
