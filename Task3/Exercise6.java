package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise6 {
    private Scanner myScan;
    Exercise6(){this.myScan= new Scanner(System.in);}

    public void check() {
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter three numbers Respectively:");
        list1.add(myScan.nextInt());
        list1.add(myScan.nextInt());
        list1.add(myScan.nextInt());

        if (list1.get(0) < list1.get(1) && list1.get(1) < list1.get(2)) {
            System.out.println("INCREASING");

        } else if (list1.get(0) > list1.get(1) && list1.get(1) > list1.get(2)) {
            System.out.println("DECREASING");
        } else {
            System.out.println("RANDOM");

        }
    }

    public static void main(String[] args) {
        Exercise6 ex6 = new Exercise6();
        ex6.check();
    }

}
