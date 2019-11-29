package rmuti;
import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args) {
        float km;
        Scanner pi = new Scanner(System.in);
        km=pi.nextFloat();
        System.out.print(""+km);
        System.out.print("กม. เท่ากับ");
        System.out.print(""+(km*0.62137));
        System.out.print("ไมล์");
    }
}
