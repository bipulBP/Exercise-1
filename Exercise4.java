import java.util.Scanner;

public class Exercise4 {
    private Scanner myScan;

    Exercise4(){
        this.myScan = new Scanner(System.in);
    }

    public void abcd(){

        System.out.println("Enter a number:");
        int a = myScan.nextInt();

        if(a%5==0){
            System.out.println("JavaTraining");
        }
        else if(a%3==0){
            System.out.println("ConsultAdd");
        }
        else if(a%3==0 & a%5==0){
            System.out.println("consultAddJavaTraining");
        }
    }


    public static void main(String[] args) {
        Exercise4 ex4 = new Exercise4();
        ex4.abcd();
    }

}
