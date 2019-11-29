package rmuti;
import java.util.Scanner;
public class Compute {
    public static void main(String[] args) {
        int a,c,b,fin;
                Scanner pi = new Scanner(System.in);
        a=pi.nextInt();
        b=pi.nextInt();
        c=pi.nextInt();
        fin=(a*a)+(b*b*b)+(c*c*c*c);
        System.out.println(fin);
    }
}
