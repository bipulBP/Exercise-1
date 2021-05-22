package Task4;

import java.util.Scanner;

public class Exercise4 {

    public void sum(int[][] first, int[][] second,int row, int col){
        int[][] sum = new int[row][col];

        for(int r = 0; r<row;r++ ){
            for(int c = 0;c<col;c++){
                sum[r][c] = first[r][c] + second[r][c];
            }
        }

        System.out.println("Sum Of Two Matrices:");
        for(int r = 0; r<sum.length;r++){
            for(int c=0;c<sum[0].length;c++){
                System.out.print(sum[r][c] + "\t");
            }
            System.out.println(" ");
        }


    }



    public static void main(String[] args) {
        Exercise4 ex4 = new Exercise4();
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = myScan.nextInt();
        System.out.println("Enter the number of Columns:");
        int col = myScan.nextInt();

        int[][] first = new int[row][col];
        int[][] second = new int[row][col];

        for(int r = 0; r<row;r++){
            for(int c = 0;c<col;c++){

                System.out.println(String.format("Enter first[%d][%d] integer ",r,c));
                first[r][c] = myScan.nextInt();
                System.out.println(String.format("Enter second[%d][%d] integer ",r,c));
                second[r][c] = myScan.nextInt();
            }
        }


        ex4.sum(first,second,row,col);


    }
}
