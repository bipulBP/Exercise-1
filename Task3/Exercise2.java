package Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
     private Scanner myScan;
     Exercise2(){this.myScan=new Scanner(System.in);}

     public void calc(){
         int sum =0;
         ArrayList<Integer>  abcd = new ArrayList<>();
         System.out.println("Enter 10 numbers:");
         for(int i= 1;i<=10;i++){
             int b = myScan.nextInt();
             abcd.add(b);
             sum = sum+ b;
         }

         System.out.println("Total sum is:"+sum);
         System.out.println("Average is:"+sum/10);
     }

    public static void main(String[] args) {
        Exercise2 ex2 = new Exercise2();
        ex2.calc();

    }

}
