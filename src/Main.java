import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80

        //Instantiate a Scanner Class, Create an Object
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = scanner.nextInt();
        System.out.println();

        for (int i = 1 ; i <= 10 ; i ++ ) {

            System.out.println(number * i);
        }

    }
}