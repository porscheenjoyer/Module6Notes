import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double myDouble = 0;
        boolean done = false;
        String trash;

        System.out.println("Give me a double: ");

        do {

            System.out.println("Give me a double");
            if (in.hasNextDouble()) {

                myDouble = in.nextDouble();
                break;

            }

            else {

                trash = in.nextLine();
                System.out.println("Invalid input, please try again.");

            }

        } while (done == true);

        //ifs come here





    }
}