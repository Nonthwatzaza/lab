package rmuti;
import java.util.Scanner;
public class ComputeABS {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if ( b<a )
        System.out.println("ค่าสัมบูรณ์ = " + (a-b));
        else
            System.out.println("ค่าสัมบูรณ์ = " + (b-a));
    }
}
