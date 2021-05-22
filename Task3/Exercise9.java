package Task3;

import java.util.Scanner;

public class Exercise9 {
    private Scanner myScan;
    Exercise9(){
        this.myScan = new Scanner(System.in);
    }


    public void pattern(){
        System.out.println("Enter the number of rows:");
        int rw = myScan.nextInt();
        for(int i = 1;i<=rw;i++){
            for(int j= 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }


    }

    public static void main(String[] args) {
        Exercise9 ex9 = new Exercise9();
        ex9.pattern();

    }
}
