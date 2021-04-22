import java.util.ArrayList;

public class Exercise8 {

public ArrayList num(){
    ArrayList<Integer> abcd = new ArrayList<>();

    for(int i=0;i<=6;i++){
        if(i!=3 & i!=6){
            abcd.add(i);
        }
    }
    return abcd;
}

    public static void main(String[] args) {
        Exercise8 ex8 = new Exercise8();
        System.out.println(ex8.num());

    }
}
