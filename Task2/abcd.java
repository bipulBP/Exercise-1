package Task2;

import java.util.Scanner;

public class abcd {
     int a;
    int b;
    int sum;



     abcd(int a, int b,int ss) {
        this.a = a;
        this.b = b;
        this.sum = ss;


    }

    abcd(){
    }


     int met1(int b){
        int sum;
        sum = b+ a +30;
        System.out.println("total sum:"+sum);
        return sum;

    }

    public int met2(){
        int sum2 = a +b;
        return sum2;


    }


    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
      abcd ob = new abcd();
       /System.out.println();
        abcd ad = new abcd(2,3,30);
        System.out.println(ad.met2());
       // ob.met1();

    }



}


   class bbb{


}