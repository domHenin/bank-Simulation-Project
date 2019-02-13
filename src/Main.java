import java.util.*;

class BuildBank {
    private int usrPin=0517;  /*pin=335*/
    private int insrtPin;
//  private int option;
    private int withDwrlOption;
    private int deposOption;
    private double chkStatMent=10000.17;    /*10000.17*/ /*have hard coded the value here, ask for assistance*/
    private double savStatment=15000.98;    /*15000.98*/ /*have hard coded the value here, ask for assistance*/
    private double deposit;
    private double withDrwl;       /*0*/

    public void setUsrPin(int usrPin) { this.usrPin = usrPin; }
    public int getUsrPin() { return usrPin;  }

    public void setInsrtPin(int insrtPin) { this.insrtPin = insrtPin; }
    public int getInsrtPIn() { return insrtPin; }

//    public void setOption(int option) { this.option = option; }
//    public int getOption() { return option; }

    public void setWithDwrlOption(int withDrwl) { this.withDrwl = withDrwl; }
    public int getWithDwrlOption() { return withDwrlOption; }

    public void setDeposOption(int deposOption) { this.deposOption = deposOption; }
    public int getDepoOption() { return deposOption; }

    public void setChkStatMent(double chkStatMent) { this.chkStatMent = chkStatMent; }
    public double getChkStatMent() { return chkStatMent; }

    public void setSavStatment(double savStatment) { this.savStatment = savStatment; }
    public double getSavStatement() { return savStatment; }

    public void setDeposit(double deposit) { this.deposit = deposit; }
    public double getDeposit() { return deposit; }

    public void setWithDrwl(double withDrwl) { this.withDrwl = withDrwl; }
    public double getWithDrwl() { return withDrwl; }
}

class BuildUser {
    Scanner input = new Scanner(System.in);
    private String usrNam;

    public void setUsrNam(String usrNam) { this.usrNam = usrNam; }
    public String getUsrNam() { return usrNam; }

    //  User Information
    public void userInfo() {
      System.out.println("inside BuildUser/userInfo");
//        System.out.println("Please Enter your name: ");
//        usrNam=input.nextLine();
//        System.out.println(usrNam);

    }

}

class BuildUserInput {
    Scanner input = new Scanner(System.in);
    String usrNam;
    int insrtPin;
    int option;


//User Info
    public void userInfo() {
        System.out.println("Please Enter your name: ");
        usrNam = input.nextLine();
    }
//User Input
    public void userInput() {
        BuildBank buildBankUserInput = new BuildBank();
        buildBankUserInput.setChkStatMent(10000.17);
        buildBankUserInput.getChkStatMent();
        buildBankUserInput.setSavStatment(15000.98);
        buildBankUserInput.getSavStatement();
        buildBankUserInput.setUsrPin(0517);
        buildBankUserInput.getUsrPin();
        System.out.println("Please enter your pin: ");
        insrtPin = input.nextInt();

        while (insrtPin != buildBankUserInput.getUsrPin()) {
            System.out.println("The entered pin is incorrect!");
            System.out.println("Please ReEnter: ");
            insrtPin = input.nextInt();
        }
    }

    public void userOptions() {
        BuildBank buildBankUserOptions = new BuildBank();
        System.out.println("\n\tChoose an option: ");
        System.out.println("\t1.Checking Statement 2.Saving Statement 3.Withdrawal 4.Deposit");
        option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println(buildBankUserOptions.getChkStatMent());
                break;
            case 2:
                System.out.println(buildBankUserOptions.getSavStatement());
                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("recursion..");
                break;
        }
    }
}

class BuildUserBankInfo {
    BuildBank buildUserBankInfo = new BuildBank();
//user Bankstatment
    public void bnkStatement() {
        buildUserBankInfo.setChkStatMent(10000.17);
        System.out.println("Current Balance (Checking): $" +buildUserBankInfo.getChkStatMent());
    }
//user Savings statement
    public void userSavStment() {
        buildUserBankInfo.setSavStatment(15000.98);
        buildUserBankInfo.getSavStatement();
    }

}

public class Main {
//    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank");
//        userInfo();
//        userInput();
        BuildUserInput buildUserInputMain = new BuildUserInput();
        buildUserInputMain.userInfo();
        buildUserInputMain.userInput();   /*this has been commentd out bcuz im getting an unknown pin*/
        buildUserInputMain.userOptions();




        System.out.println("Thank You!");

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
// deposOption --> 'deposit option'
// chkStatMent --> 'check statement'
// savStatment--> 'save statement'
// deposit --> 'deposit'
// withDrwl --> withdrawal'
// usrNam --> 'user name'
//userSavStment --> 'user save statement'

//ORGINAL CODE:
//        User Bankstatement
//        public static void bnkStatement() {
//            System.out.println("Current Balance (Checking): $" +chkStatMent);
//        }
//
////        User Savings
//        public static void userSavStment() {
//            System.out.println("Current Balance(Savings): $" +savStatment);
//        }
//
//        public static void userWithdrawal() {
//            System.out.println("\tChecking: $" +savStatment+"\tSaving: $" +savStatment);
//            System.out.println("Withdrawal Amount: $");
//            System.out.println("From which account? 1.Checking 2.Saving");
//            withDrwl=input.nextInt();
//            switch (withDrwlOption) {
//                case 1:
//                    withDrwl=chkStatMent-withDrwl;
//                    System.out.println("Current Balance (Checking): $" +withDrwl);
//                    if (withDrwl>savStatment){
//                        System.out.println("Insufficient Funds!");
//                    } else if(withDrwl==chkStatMent){
//                        System.out.println("WARNING!\nBy entering the above amount you will deplete your account.");
//                        System.out.println("Would you like to continue? 1.Yes 2.No");
//                        wthDrwlOption=input.nextInt();
//                        switch (wthDrwlOption){
//                            case 1:
//                                System.out.println("Processing...");
//                                System.out.println("Please take your money.");
//                                System.out.println("Balance: $0.00");
//                                break;
//                            case 2:
//                                System.out.println("Thankyou!\nYour Process has been saved.");
//                                System.out.println("Balance: $" +chkStatMent);
//                                break;
//                            default:
//                                break;
//                        }
//                    } else {
//                        withDrwl=chkStatMent-withDrwl;
//                        System.out.println("Current Balance(Saving):$ "+withDrwl);
//                    }
//                    break;
////                case 2: forgot to finish case2
//            }
//        }
//        public static void userOther() {
//            System.out.println("Here you have the option to customize your account.");
//            System.out.println("More features will be added shortly!");
//        }
//option=input.nextInt();
//        switch (option) {
//        case 1:
//        bnkStatement();
//        break;
//        case 2:
//        userSavStment();
//        break;
//        case 3:
//        userWithdrawal();
//        break;
//        case 4:
//        userDeposit();
//        break;
//default:
//        System.out.println("recursion..");
//        break;
//        }
