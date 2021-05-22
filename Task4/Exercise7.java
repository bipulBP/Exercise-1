package Task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercise7 {




    public static void main(String[] args) {
        Exercise7 ex7 = new Exercise7();
       int[] integers1 = new int[] {2,3,1,4,5,6,7,9};


      int min1 =  Arrays.stream(integers1)
                  .min().getAsInt();

        int max1 =  Arrays.stream(integers1)
                .max().getAsInt();

        System.out.println("The difference in max and min value is:" + (max1-min1));


    }
}
