package Task2;

import java.util.Scanner;

public class Exercise3 {

    private Scanner myScan;


    Exercise3(){
        this.myScan = new Scanner(System.in);
    }




    public int add(){
        System.out.println("Enter first value ranging 1 t0 10:");
        int a = myScan.nextInt();
        System.out.println("Enter second value ranging 1 to 10:");
        int b = myScan.nextInt();
        int z = a+b;
       return (z+30);

    }

    public static void main(String[] args) {

        Exercise3 ex3 = new Exercise3();
        System.out.println("The final Value is:"+(ex3.add()));

    }


}
