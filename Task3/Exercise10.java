package Task3;

import java.util.Scanner;

public class Exercise10 {

    public static int fact(int num){
        int factorial;
        for(factorial = 1;num>1;num-- ){
            factorial *=num;
        }
        return factorial;
    }

    public static int ncr(int n, int r){
        return fact(n)/(fact(n-r)*fact(r));
    }

    public void pascal(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i;j++){
                System.out.print(" ");
            }
            for(int j =0;j<=i;j++){
                System.out.print(" "+ncr(i,j));
            }
        }
        System.out.println(" ");


    }

    public static void main(String[] args) {
        Exercise10 ex10 = new Exercise10();
        System.out.println("enter the number of rows:");
        ex10.pascal((new Scanner(System.in)).nextInt());


    }
}
