package Task2;

import java.util.ArrayList;

public class Exercise7 {

    public ArrayList aList1(){

        ArrayList<Integer> num = new ArrayList<Integer>();

        for( int i=2000;i<=3200;i++){
            if(i%7==0 & i%5!=0){
                num.add(i);
            }
        }

        return num;

    }

    public static void main(String[] args) {

        Exercise7 ex7 = new Exercise7();
        System.out.println(ex7.aList1());

    }
}
