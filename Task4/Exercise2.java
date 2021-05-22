package Task4;

public class Exercise2 {


    public void seconLarg(int[] num, int n){


        for(int i = 0; i<=(n-1);i++){
            int count = 0;
            for(int j = 0;j<=(n-1);j++){

                if(num[i]>num[j]){
                   count =+1;
                }
            }


            if(count==(n-1)){ System.out.println("Second largest number is:"+num[i]);  break;}


        }

    }




    public static void main(String[] args) {
        Exercise2 ex2 = new Exercise2();
        int[] num = {1, 2, 3, 4, 5, 6};
        int n = num.length;
        ex2.seconLarg(num, n);

    }
}
