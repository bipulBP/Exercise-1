package Task4;

import java.util.Scanner;

public class Exercise5 {


    public void work(int[][] matrix1, int r, int c){

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(matrix1[i][j]==0){
                    for(int k = j;k<(c-1);k++){
                         matrix1[i][k]=matrix1[i][k+1];
                    }
                    matrix1[i][c-1]=0;
                }

            }

        }

        for(int a = 0; a<matrix1.length;a++){
            for(int b=0;b<matrix1[0].length;b++){
                System.out.print(matrix1[a][b] + "\t");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Exercise5 ex5 = new Exercise5();
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = myScan.nextInt();
        System.out.println("Enter the number of Columns:");
        int col = myScan.nextInt();

        int[][] matrix1 = new int[row][col];

        for(int r = 0; r<row;r++){
            for(int c = 0;c<col;c++){

                System.out.println(String.format("Enter [%d][%d] integer ",r,c));
                matrix1[r][c] = myScan.nextInt();

            }
        }

       ex5.work(matrix1,row,col);
    }
}
