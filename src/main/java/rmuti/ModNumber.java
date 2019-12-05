package rmuti;
import java.util.Scanner;
public class ModNumber {
    public static void main(String[] args) {
        int n,nm;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if ((n%2)==0 && n>1000)
        System.out.println("เงือนไขถูกต้อง");
        else
            System.out.println("เงือนไขไม่ถูกต้อง");
    }
}
