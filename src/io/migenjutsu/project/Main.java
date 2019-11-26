import java.util.*;

class BuildBank {
    private int usrPin;
    private int insrtPin;
    private int option;
    int withDwrlOption;
    int depoOption;
    double chkStatMent;    /*10000.17*/
    double savStatment;    /*15000.98*/
    double deposit;
    double withDrwl=0;
    String usrNam;

    public void setUsrPin(int usrPin) { this.usrPin = usrPin; }
    public int getUsrPin() { return usrPin;  }

    public void setInsrtPin(int insrtPIn) { this.insrtPin = insrtPIn; }
    public int getInsrtPIn() { return insrtPin; }

    public void setOption(int option) { this.option = option; }
    public int getOption() { return option; }

    public void setWithDwrlOption(int withDrwl) { this.withDrwl = withDrwl; }
    public int getWithDwrlOption() { return withDwrlOption; }

    public void setDepoOption(int depoOption) { this.depoOption = depoOption; }
    public int getDepoOption() { return depoOption; }

    public void setChkStatMent(double chkStatMent) { this.chkStatMent = chkStatMent; }
  public int getChkStatMent() { return chkStatMent; }

    public void setSavStatment(int savStatment) { this.savStatment = savStatment; }
//  public int getSavStatement() { return savStatment; }

    public void setDeposit(int )
}

public class Main {
//    static Scanner input = new Scanner(System.in);
//    static int usrPin = 1234;
//    static int insrtPin;
//    static int option;
//    static int withDrwlOption;
//    static int wthDrwlOption;
//    static int depoOption;
//    static double chkStatMent=10000.17;
//    static double savStatment=15000.98;
//    static double deposit;
//    static String usrNam;
//    static double withDrwl=0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Bank");
//        userInfo();
        userInput();
        System.out.println("Thank You!");
        
        char option;

        do {
            option=getChoice();
            switch(option) {
                case C:

            }
        }

        System.out.println("Thank You!");
    }

    //    User Information
    public static void userInfo() {
        System.out.println("Please Enter your name: ");
        usrNam=input.nextLine();
    }

    //    User Input
    public static void userInput() {
        System.out.println("Please enter your pin: ");
        insrtPin=input.nextInt();

        while(insrtPin != usrPin){
            System.out.println("The entered pin is incorrect!");
            System.out.println("Please reEnter");
            insrtPin=input.nextInt();
        }

//        User Bankstatement
        // public static void bnkStatement() {
        //     System.out.println("Current Balance (Checking): $" +chkStatMent);
        // }

//        User Savings
        public static void userSavStment() {
            System.out.println("Current Balance(Savings): $" +savStatment);
        }

        public static void userWithdrawal() {
            System.out.println("\tChecking: $" +savStatment+"\tSaving: $" +savStatment);
            System.out.println("Withdrawal Amount: $");
            System.out.println("From which account? 1.Checking 2.Saving");
            withDrwl=input.nextInt();
            switch (withDrwlOption) {
                case 1:
                    withDrwl=chkStatMent-withDrwl;
                    System.out.println("Current Balance (Checking): $" +withDrwl);
                    if (withDrwl>savStatment){
                        System.out.println("Insufficient Funds!");
                    } else if(withDrwl==chkStatMent){
                        System.out.println("WARNING!\nBy entering the above amount you will deplete your account.");
                        System.out.println("Would you like to continue? 1.Yes 2.No");
                        wthDrwlOption=input.nextInt();
                        switch (wthDrwlOption){
                            case 1:
                                System.out.println("Processing...");
                                System.out.println("Please take your money.");
                                System.out.println("Balance: $0.00");
                                break;
                            case 2:
                                System.out.println("Thankyou!\nYour Process has been saved.");
                                System.out.println("Balance: $" +chkStatMent);
                                break;
                            default:
                                break;
                        }
                    } else {
                        withDrwl=chkStatMent-withDrwl;
                        System.out.println("Current Balance(Saving):$ "+withDrwl);
                    }
                    break;
//                case 2: forgot to finish case2
            }
        }

        public static char getChoice() {
            char result;
    
            Scanner scanner = new Scanner(System.in);
    
            System.out.println();
            System.out.println("#########################");
            System.out.println("# [C]hecking Statement #");
            System.out.println("# [S]aving Statement   #");
            System.out.println("# [W]ithdrawal\t #");
            System.out.println("# [D]eposit\t #");
            System.out.println("# [Q]uit Program\t #");
            System.out.println("#########################");
    
            System.out.println("Enter Selection: ");
            result=scanner.nextLine().toUpperCase().charAt(0);
            return result;
        }

        public static void userOther() {
            System.out.println("Here you have the option to customize your account.");
            System.out.println("More features will be added shortly!");
        }
    }
}

/*Verse of the Day:
 * Ephesians 2:8-9
 * For by grace are ye saved through faith; and that not of yourselves; it is the gift of God
 * Not of works, lest any man should boast.
 */

//DIRECTORY:
// usrPin --> 'user pin'
// insrtPin --> 'insert pin'
// option --> 'option'
// withDwrlOption --> 'with drawal option'
// depoOption --> 'deposit option'
// chkStatMent --> 'check statement'
// savStatment--> 'save statement'
// deposit --> 'deposit'
// withDrwl --> withdrawal'
// usrNam --> 'user name'

