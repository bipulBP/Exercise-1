package Task3;

import java.util.Scanner;

public class Exercise8
{

    public void whatKind(int year){
        if(year%4==0){
            System.out.println("This is leep year!!");
        }
        else{
            System.out.println("This is not leep year!!");
        }

    }

    public static void main(String[] args) {
        Exercise8 ex8= new Exercise8();
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the year:");

        ex8.whatKind(myScan.nextInt());

        }
    }

