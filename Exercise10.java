import java.util.Scanner;


public class Exercise10 {
    private Scanner myScan;
    Exercise10(){
        this.myScan = new Scanner(System.in);
    }

    public void abcd(){
        System.out.println("Enter a floating number:");
        float a = myScan.nextFloat();
        float b = Math.abs(a);
        if(a==0) {
            System.out.println("Zero");
        }
        if(a<0){
            System.out.println("Negative");

        }
        if(a>0){
            System.out.println("Positive");
        }
        if(b<1){
            System.out.println("Small");
        }
        if(b>1000000){
            System.out.println("Large");
        }


    }


    public static void main(String[] args) {
        Exercise10 ex10 = new Exercise10();
        ex10.abcd();

    }

}
