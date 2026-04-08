/*
import java.util.Scanner;
public class cwa_string {
    static void main() {
        Scanner sc = new Scanner(System.in);
       // String St = sc.next();
        String St = sc.nextLine();
        System.out.println(St);
    }
}
*/

public class cwa_string {
    static void main() {
        String name = "Akash";
       // System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
    }
}