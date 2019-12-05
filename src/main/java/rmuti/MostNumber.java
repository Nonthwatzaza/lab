package src.main.java.rmuti;
import java.util.Scanner;
public class MostNumber {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        n1= sc.nextInt();
        n2= sc.nextInt();
        n3= sc.nextInt();
        if (n1 > n2)
            if (n1 > n3)
                System.out.println("The greatest: " + n1);

        if (n2 > n1)
            if (n2 > n3)
                System.out.println("The greatest: " + n2);

        if (n3 > n1)
            if (n3 > n2)
                System.out.println("The greatest: " + n3);
    }
}
