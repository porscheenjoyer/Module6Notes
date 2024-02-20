import java.util.Scanner;


public class task {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        double myNum = 0;
        boolean done = false;
        String trash;

        //loop
        do {

            System.out.println("Please enter a number.");

            if(in.hasNextDouble()) {

                myNum = in.nextDouble();
                done = true;

            }

            else {

                trash = in.nextLine();
                System.out.println("You gave an invalid value: " + trash);

            }

        } while (!done);

        if (myNum == 0) {

            System.out.println("Zero");

        }

        else if (myNum < 0) {

            System.out.println("Negative");

        }

        else if (myNum > 0) {

            System.out.println("Positive");

        }

        if (myNum < 1) {

            System.out.println("Small");

        }

        else if (myNum > 1000000) {

            System.out.println("Large");

        }


    }
}
