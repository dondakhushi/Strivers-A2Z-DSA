import java.util.Scanner;
public class Array_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        for (String s : arr) {
            System.out.println(s);
        }


        String s = sc.nextLine();
        System.out.println("String is :" + s);
        System.out.println("String Length is :" + s.length());
        sc.close();
    }
}
