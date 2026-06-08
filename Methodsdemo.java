import java.util.Scanner;
public class Methodsdemo {
    static int total(int chemistry, int physics, int maths){
        return (chemistry + physics)/2 + maths;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter chemistry mark:");
        int chemistry = sc.nextInt();
        System.out.println("Enter physics mark:");
        int physics = sc.nextInt();
        System.out.println("Enter maths mark:");
        int maths = sc.nextInt();

        int cutoff = total(chemistry, physics, maths);
        System.out.println("cutoff = " + cutoff);
        sc.close();
    }

}
