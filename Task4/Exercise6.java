package Task4;

public class Exercise6 {

    public void dub(int[] abc){

        for(int i=0;i<abc.length;i++){
            for(int j = i+1;j<abc.length;j++){
                if(abc[i]==abc[j]){
                    abc[j] = 0;
                    for(int k = i+1; k<abc.length-1;k++){
                        abc[k]=abc[k+1];
                    }
                    abc[abc.length-1]=0;

                }

            }
        }

        for (int a:abc) {
            System.out.print(" "+a);

        }
    }



    public static void main(String[] args) {

        Exercise6 ex6 = new Exercise6();
        int[] abc = {2,2,3,3,4,4,4,11,11,11,11};
        ex6.dub(abc);



    }
}
