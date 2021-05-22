package Task3;

import java.util.Scanner;

public class Exercise5 {
    private Scanner myScan;

    Exercise5(){
        this.myScan = new Scanner(System.in);
    }


    public void longgg(){
        int count = 0;
        int sum = 0;
        System.out.println("Enter a floating Number:");
        float num = myScan.nextFloat();
        float  num1 = num/10;

        //int abc = (int) num;

        //System.out.println(abc);
        //System.out.println(num);
        System.out.println( num1);
//        while (num>0) {
//            System.out.println("num%10");
//            count++;
//            sum = (int) (sum + (num%10));
//            num = num-(num%10);





    }





    public static void main(String[] args) {
        Exercise5 ex5 = new Exercise5();
        ex5.longgg();

    }
}
