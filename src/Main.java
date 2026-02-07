import java.util.Scanner;

public class Main {



    public static void main(String[] args){
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
        if(choice == 1){
            System.out.println("add two numbers");
        }
            else if(choice == 2){
                System.out.println("check if a number is even or odd");
            }
            else if(choice == 3){
                System.out.println("print numbers from 1 to N");
            }
            else if(choice == 4){
                System.out.println("display days of the week");
            }
            else if(choice == 5){
                System.out.println("exit");
            }
            else {
                System.out.println("invalid choice");
            }





    }
}