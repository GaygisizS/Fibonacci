import java.util.Scanner;

public class Fibonacci {

    /*
    Containing an integer number of elements received from the user (less than 47)
    Create a FIBONACCI array (Write this by creating a method)
    Ex: for numberi=10
    Like 0-1-1-2-2-3-3-5-8-13-21-34
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer less than 47");
        int number = scan.nextInt();

        fibonacci(number);

    }

    public static void fibonacci(int number) {

        int num1 = 0;
        int num2 = 1;
        int num3;

        //like 0-1-1-2-3-5-8-13-21-34


        if (number < 47 && number > -1) {
            for (int i = 0; i < number; i++) {

                System.out.print(num1 + " ");
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;

            }
        } else System.out.println("Please enter a valid integer");


    }


}