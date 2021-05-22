package Task3;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Exercise3 {
    private Scanner myScan;


    Exercise3(){
        this.myScan = new Scanner(System.in);

    }

    public void months(){
        System.out.println("Enter the month number to get the number of Days in it:");

        switch(myScan.nextInt()){

            case 1:
            case 3:
            case 5:
            case 11:
            case 9:
            case 7:
                System.out.println("Number of Days: 31");
                break;
            case 2:
                System.out.println("Number of Days: 28");
                break;
            case 4:
            case 12:
            case 10:
            case 6:
            case 8:
                System.out.println("Number of Days: 30");
                break;
            case 13:
                System.out.println("Invalid Details");

        }

    }

    public static void main(String[] args) {
        Exercise3 ex3 = new Exercise3();
        ex3.months();
    }
}
