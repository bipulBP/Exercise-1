import java.awt.*;
import java.util.Collections;
import java.util.Scanner;

public class Exercise1<Int> {

 private  Scanner myPut;

 Exercise1(){
     this.myPut =  new Scanner(System.in);
 }



    public void swap1(){

        System.out.println("Enter first integer a:");
       int a = myPut.nextInt();
        System.out.println("Enter second integer b:");
        int b = myPut.nextInt();

        int  result = a;
         a = b;
         b = result;
        System.out.println("Value after swap: x="+a+" y="+b);

    }



    public void swap2(){

        System.out.println("Enter first integer x:");
        int x = myPut.nextInt();
        System.out.println("Enter second integer y:");
        int y = myPut.nextInt();

        x = x+y;
        y= x-y;
        x= x-y;

        System.out.println("values after swap: x="+x+" y="+y);

    }



    public static void main(String[] args) {

     Exercise1 ex = new Exercise1();
     ex.swap1();
     ex.swap2();





    }




}
