import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice:");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("JAVA");
                break;
            case 2:
                System.out.println("PYTHON");
                break;
            case 3:
                System.out.println("C++");
                break;
            default:
                System.out.println("Invalid Input, only enter 1 to 3");

        }
        sc.close();
    }
}
