package rmuti;
import java.util.Scanner;
public class TailEven {
    public static void main(String[] args) {
        int n,ns;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        ns = n%10;
        if ((n%2)==0)
         System.out.println("เลขเป็นคู่ เลขท้ายเป็น"+ ns);
        else
            System.out.println("เลขเป็นคี่ เลขท้ายเป็น"+ ns);

    }
}
