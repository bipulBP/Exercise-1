package Task4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise11 {

    public void xxx(List<Integer> list1){

       List<Integer> list2 = list1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(list2);

    }

    public static void main(String[] args) {
        Exercise11 ex10 = new Exercise11();

        List<Integer> list1 = Arrays.asList(2,3,4,5,6,7,8);
        ex10.xxx(list1);
    }
}
