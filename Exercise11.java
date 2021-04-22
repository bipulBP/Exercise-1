import java.util.Scanner;

public class Exercise11 {

    private Scanner myScan;
    Exercise11(){
        this.myScan= new Scanner(System.in);
    }

    public String abcdef(){

        String xx = "Not Found";
        String yy = "Found";

        char[] arr = {'r','a','n','d','o','m','R','A','N','D','O','M'};
        System.out.println("Enter a Character:");
        char ch = myScan.next().charAt(0);

        for (char b: arr){
            if(b==ch){
              return yy;
            }
        }
        return xx;

    }




    public static void main(String[] args) {
        Exercise11 ex11 = new Exercise11();
        System.out.println(ex11.abcdef());
    }
}
