import java.util.Scanner;

public class Basic_InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String name = sc.nextLine();
        System.out.println("Enter your Age :");
        int age = sc.nextInt();
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        
        sc.close();
    }
}
