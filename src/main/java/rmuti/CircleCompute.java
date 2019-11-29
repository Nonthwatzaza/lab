package rmuti;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CircleCompute {
    public static void main(String[] args) {
        double r,pi=(Math.PI),Size,aws;
        Scanner pn = new Scanner(System.in);
        r=pn.nextDouble();
        Double R = r*r;
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("เส้นรอบวง= " +(2*pi*r));
        System.out.println("พื้นที่= " +df.format(pi*R));


    }
}
