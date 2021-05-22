package Task3;

import javax.swing.*;
import java.util.Scanner;

public class Exercise11 {


    public void checktwo(float a, float b) {
        float one = Math.round(a * 100);
        float two = Math.round(b * 100);

        }






    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter two floating numbers respectively:");
        float c = (myScan.nextFloat());
        float d = myScan.nextFloat();
        Exercise11 ex11 = new Exercise11();
        ex11.checktwo(c,d);




    }
}
