package Task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {



    public ArrayList dub(ArrayList num1,ArrayList num, int n) {

//        for(Object x : num){
//            int count1 =+1;
//            for (Object y :num){
//                int count2 =+ 1;
//                if((count1 != count2) &&  (x==y)){
//
//                        num.remove(count2);


        for(int i = 0; i< (n-1);i++){
            for(int j =i+1;j<(n-1);j++){
                if(num1.get(i)==num1.get(j)) {
                    num.remove(j);
                }
                }

            }




          return num;
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        System.out.println("Please enter the numbers respectively:");
        int n = myScan.nextInt();
        for(int i = 1; i<=n;i++){
            num.add(myScan.nextInt());
        }
        ArrayList<Integer> num1 = new ArrayList<>();
        num1 = num;
        Exercise1 ex1 = new Exercise1();
       ex1.dub(num1,num,n);



    }
}
