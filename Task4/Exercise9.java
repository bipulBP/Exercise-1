package Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise9 {

    public void xxx(List<Integer> list2){
        list2.forEach(System.out::println);



    }

    public static void main(String[] args) {
        Exercise9 ex9 = new Exercise9();
        List<Integer> list1 = Arrays.asList(2, 3, 4, 4, 5, 22, 46, 12) ;
        List<Integer> list2 =  list1.stream().filter(a -> a<=6).collect(Collectors.toList());

        ex9.xxx(list2);



    }
}
