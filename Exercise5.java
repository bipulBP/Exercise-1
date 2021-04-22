import java.util.Scanner;

    public class Exercise5 {
    private static Scanner myScan;

    Exercise5(){
        this.myScan = new Scanner(System.in);
    }

    public int ASDM(int a){
        int resultx =0;
        System.out.println("Enter first number:");
        int first = myScan.nextInt();
        System.out.println("Enter a second number:");
        int second = myScan.nextInt();

        if(a==1){
            System.out.println("Value of Addition is :");
             resultx =(first+second);

        }
        else if(a==2){
            System.out.println("Value of substraction is:");
            resultx = (first-second);

        }
        else if(a==3){
            System.out.println("Value of Multiplication is:");
            resultx = (first * second);
        }
        else if(a==4){
            System.out.println("Value of Division is:");
            resultx =  (first/second);
        }

        return resultx;

    }

      public int Average(){
          System.out.println("Enter first number:");
          int first1 = myScan.nextInt();
          System.out.println("Enter second number:");
          int second2 = myScan.nextInt();

          System.out.println("Value of Average is:");
          return ((first1+second2)/2);

    }


    public static void main(String[] args) {



        Exercise5 ex5 = new Exercise5();

        System.out.println("PLease Enter 1 for Addition, 2 for Subtraction" +
                "3 for Division, 4 for Multiplication and 5 for Average!");
        int choice = myScan.nextInt();

        if(choice<=4) {
            int result = ex5.ASDM(choice);
            if (result < 0) {
                System.out.println("Oops options 1/2/3/4/5 is returning negative value!!");
            }
            else{
                System.out.println(result);
            }
        }
        else if(choice == 5) {
            int result = ex5.Average();
            if (result < 0) {
                System.out.println("Oops options 1/2/3/4/5 is returning negative value!!");
            }
            else{
                System.out.println(result);
            }
        }

        else{
            System.out.println("you entered non available options!!");
        }











    }
}
