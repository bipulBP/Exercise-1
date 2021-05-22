package Task3;

import java.util.Scanner;

public class Exercise1 {

    private Scanner myScan;

    Exercise1(){ this.myScan = new Scanner(System.in); }

    public void table(){
        System.out.println("Enter a nUmber:");
        int a = myScan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+" * "+ i + " ="+ (a*i));
        }
    }


    public static void main(String[] args) {
        Exercise1 ex1 = new Exercise1();
        ex1.table();


    }

}
