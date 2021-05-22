package Task3;

import java.util.Scanner;

public class Exercise4 {


    public void calMtd(int n){
        System.out.println("Total Sum of first "+n+" natural numbers is:"+(n*(n+1)/2));
    }
    public static void main(String[] args) {
        Exercise4 ex4 = new Exercise4();
        System.out.println("Enter a integer:");
        ex4.calMtd(new Scanner(System.in).nextInt());
    }
}
