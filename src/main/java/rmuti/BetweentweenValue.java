package rmuti;
import java.util.Scanner;
public class BetweentweenValue {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if  ((a>=10) && (a<=100))
        System.out.println("ค่าอยู่ระหว่าง 10 ถึง 100");
        else
            System.out.println ("อยู่นอกเงือนไข");




    }

}
