package Task2;

import java.util.Scanner;

public class Exercise6 {
    private Scanner myScan;

    Exercise6(){
        this.myScan = new Scanner(System.in);
    }


    public void abcdef(){

        System.out.println("Please Enter a number:");
        while(myScan.nextInt()>=0){
            System.out.println("Good Going!!");
            System.out.println("Please Enter a number:");
        }



    }

    public static void main(String[] args) {

        System.out.println("Enter the numbers!If you wanna break the entry, please enter any negative number!!");
        Exercise6 ex6 = new Exercise6();
        ex6.abcdef();
        System.out.println("Its Over!!");

    }


}
