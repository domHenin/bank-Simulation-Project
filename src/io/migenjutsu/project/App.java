package io.migenjutsu.project;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank");
        // userInfo();
        // userInput();
        // System.out.println("Thank You!");

        // Customer customerA = new Customer("1234", 500.25, 1000.50, 00, 00, "Bank of America");
        Customer customer = new Customer();

        char option;

        do {
            option = getChoice();
            switch (option) {
            case 'C':
                System.out.println("Checking bacnk statement");
                // customerA.getCurrentBalance();
                customer.bankStatement();
                break;
            case 'S':
                System.out.println("Checking savings");
                // customerA.getSaveStatement();
                customer.getSaveStatement();
                break;
            case 'W':
                System.out.println("Withdrawing...");
                customer.userWithdrawal(20.50);
                break;
            case 'D':
                System.out.println("Depositing");
                break;
            case 'Q':
                System.out.println("Quiting Program.");
                break;
            default:
                break;
            }
        } while (option != 'Q');

        System.out.println("Thank You!");
    }
    public static char getChoice() {
        char result;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("#########################");
        System.out.println("# [C]hecking Statement\t#");
        System.out.println("# [S]aving Statement  \t#");
        System.out.println("# [W]ithdrawal\t\t#");
        System.out.println("# [D]eposit\t\t#");
        System.out.println("# [Q]uit Program\t#");
        System.out.println("#########################");

        System.out.println("Enter Selection: ");
        result=scanner.nextLine().toUpperCase().charAt(0);
        // scanner.close();
        return result;
    }

    // public static void userOther() {
    //     System.out.println("Here you have the option to customize your account.");
    //     System.out.println("More features will be added shortly!");
    // }
}