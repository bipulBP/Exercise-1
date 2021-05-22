package Task4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise8 {


    public void rmvDuplicate(int[] array1){

        int[] array2 = Arrays.stream(array1).distinct().toArray();

        for (Integer array: array2) {
            System.out.println(array + "  ");

        }

    }

    public static void main(String[] args) {
        Exercise8 ex8 = new Exercise8();
        int[] array1 = new int[] {2,2,3,4,5,7,7,8,9,9,1,1,1};
        ex8.rmvDuplicate(array1);

    }
}
