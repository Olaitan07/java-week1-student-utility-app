import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner object to read value from the system
        Scanner sc = new Scanner(System.in);

        //print the menu
        System.out.println("==== Student utility app ====");
        System.out.println("1. Add two numbers");
        System.out.println("2. Check if a number is even or odd");
        System.out.println("3. Print numbers from 1 to N");
        System.out.println("4. Display days of the week");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        // read the user input which is an integer
        int choice = sc.nextInt();
        // use if else statement to perform the action based on the user choice
        if (choice == 1) {
            System.out.println("add two numbers");
        } else if (choice == 2) {
            System.out.println("check if a number is even or odd");
        } else if (choice == 3) {
            System.out.println("print numbers from 1 to N");
        } else if (choice == 4) {
            System.out.println("display days of the week");
        } else if (choice == 5) {
            System.out.println("exit");
        } else {
            System.out.println("invalid choice");
        }
    }
    // option1
    //Add Two Numbers

    // Method to add two numbers
    public static void addTwoNumbers() {
        // Scanner object to read value from the system
        Scanner sc = new Scanner(System.in);
        // read first number from the use and store it in num1 variable
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // read second number from the user and store it in num2 variable

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        //Calculate the sum of num1 and num2 and store it in sum variable
        int sum = num1 + num2;

        // print the sum to the system
        System.out.println("The sum is: " + sum);
    }

    // option2
    //Option 2: Check EVEN or ODD

    public static String evenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // check if the number is even or odd using modulus operator
        String result = number % 2 == 0 ? "The number is even" : "The number is odd";
        return result;
    }
    // option3
    //Option 3: Print numbers from 1 to N
    public static void printNumbersFrom1ToN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // use for loop to print numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    //option 4
    //Option 4: Display days of the week
    public static void displayDaysOfTheWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();
        // use switch case to display the day of the week based on the user input
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
        // option 5
        //Option 5: Exit
        public static void exit () {
            System.out.println("Thank you for using the app");

        }
    }