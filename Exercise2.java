import java.util.Scanner;

public class Exercise2 {


    public void printVal(Scanner medal){
        System.out.println("Enter the value:");
        System.out.println("you just entered the value:"+ medal.nextLine());
    }


    public static void main(String[] args) {

        Exercise2 ex2 = new Exercise2();
        ex2.printVal(new Scanner(System.in));
    }
}
