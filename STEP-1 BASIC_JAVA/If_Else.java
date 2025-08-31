import java.util.Scanner;
public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks;
        System.out.println("Enter your marks :");
        marks = sc.nextInt();


        if(marks >= 90)
            System.out.println("Grade A");
        else if(marks >= 70)
            System.out.println("Grage B");
        else if(marks >= 50)
            System.out.println("Grade C");
        else if(marks >= 35)
            System.out.println("Grade D");
        else
            System.out.println("Fail");

        sc.close();
    }
}
