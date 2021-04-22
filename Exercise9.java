import java.util.Scanner;

public class Exercise9 {

    private Scanner myScan;

    Exercise9(){
        this.myScan = new Scanner(System.in);
    }

    public void method1(){
        System.out.println("Enter a number:");
        int a = myScan.nextInt();
        if(a%2==0){
            if(a>=2 & a<=5){
                System.out.println("OLD");
            }
            if(a>=6 & a<=30){
                System.out.println("NEW");
            }
            if(a>30){
                System.out.println("OLD");
            }
        }
        else{
            System.out.println("NEW");
        }

    }


    public static void main(String[] args) {
        Exercise9 ex9 = new Exercise9();
        ex9.method1();

    }
}
