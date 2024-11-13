import java.util.Scanner;
public class Main {

    static int userChoices() {//prompts the user to pick a choice on the different programs/functions
        int userChoice = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("****************************************************************************");
            System.out.println("1. Program that determines if a num is positive or negative.");
            System.out.println("2. Program that displays the name of the month based on the number given.");
            System.out.println("3. Program that calculates the average and the product");
            System.out.println("4. Exit");
            System.out.println("****************************************************************************");
            userChoice = scanner.nextInt();
        } catch (Exception e) {//Throws an error incase the user fails to input integers
            System.out.println(e);
            System.out.println("Something went wrong...");
            System.out.println("INTEGERS ONLY");
        }
        if (userChoice > 4 || userChoice < 1) {
            System.out.println("Invalid input...");
            System.out.println("Please try again");
            userChoices();
        }
        return userChoice;
    }


    static void positive_or_negative() {//prompts the user for a number and determines whether it is positive or negative
        int userInput = 0;

        boolean looper = true;
        while (looper) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("******************************");
                System.out.print("Enter a number: ");
                userInput = scanner.nextInt();
                looper = false;
            } catch (Exception e) {//Throws an error incase the user fails to input integers
                System.out.println(e);
                System.out.println("Something went wrong...");
                System.out.println("INTEGERS ONLY");
            }
        }

        if (userInput < 0) {//is the logic to determine if the input is positive or negative
            System.out.println("Your number " + userInput + " is a negative number");
        } else if (userInput == 0) {
            System.out.println("Your number " + userInput + " is a neutral number");
        } else {
            System.out.println("Your number " + userInput + " is a positive number");
        }
    }


    static void month_names() {//prompts the user for a number and outputs the month associated with that number
        int userInput = 0;

        boolean looper = true;
        while (looper) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("******************************");
                System.out.print("Enter a number 1-12: ");
                userInput = scanner.nextInt();
                looper = false;
            } catch (Exception e) {//Throws an error incase the user fails to input integers
                System.out.println(e);
                System.out.println("Something went wrong...");
                System.out.println("INTEGERS ONLY");
            }
        }
        switch (userInput) {//is the logic to determine the month based on the user input
            case 1:
                System.out.println("The month is January");

                break;
            case 2:
                System.out.println("The month is February");

                break;
            case 3:
                System.out.println("The month is March");

                break;
            case 4:
                System.out.println("The month is April");

                break;
            case 5:
                System.out.println("The month is May");

                break;
            case 6:
                System.out.println("The month is June");

                break;
            case 7:
                System.out.println("The month is July");

                break;
            case 8:
                System.out.println("The month is August");

                break;
            case 9:
                System.out.println("The month is September");

                break;
            case 10:
                System.out.println("The month is October");

                break;
            case 11:
                System.out.println("The month is November");

                break;
            case 12:
                System.out.println("The month is December");

                break;
        }
    }


    static void average_and_product() {//prompts the user and determines the average and product
        int userNum = 0;
        int[] userInput;
        userInput = new int[1];
        int addition = 0;
        int product = 1;

        boolean looper = true;
        while (looper) {
            Scanner scanner = new Scanner(System.in);
            try {

                System.out.println("******************************");
                System.out.println("How many numbers would you like to enter?");
                System.out.println("******************************");
                userNum = scanner.nextInt();

                userInput = new int[userNum]; //changes the size of the array
                System.out.println("******************************");
                System.out.println("Enter " + userNum + " numbers: ");
                System.out.println("******************************");
                for (int i = 0; i < userNum; i++) {
                    System.out.print("Enter " + (i + 1) + ". ");
                    userInput[i] = scanner.nextInt();
                }
                looper = false;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Something went wrong...");
                System.out.println("INTEGERS ONLY");
            }
        }
        for (int i = 0; i < userNum; i++) {//is the logic to figuring out the average and product
            addition += userInput[i];
            product *= userInput[i];
        }
        float average = addition / userNum;
        System.out.println("The average is: " + average);
        System.out.println("the product is: " + product);
    }


    public static void main(String[] args) {
        boolean looper = true;
        while (looper) {
            switch (userChoices()) {
                case 1:
                    positive_or_negative();
                    break;
                case 2:
                    month_names();
                    break;
                case 3:
                    average_and_product();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}