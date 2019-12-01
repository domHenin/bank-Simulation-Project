package io.migenjutsu.project;

public class Customer {
    private int userPin;
    private double depositAmount;
    private double currentBalance;
    private double checkStatement;
    private double saveStatement;
    private double savings;

    // public Customer(int userPin, int depositAmount, double currentBalance, double checkStatement, double saveStatement, String bankName) {
    //     super(bankName);
    //     setUserPin(userPin);
    //     setDepositAmount(depositAmount);
    //     this.currentBalance=currentBalance;
    //     this.checkStatement=checkStatement;
    //     this.saveStatement=saveStatement;
    // }


// SETTERS:
    public void setUserPin(int userPin) { this.userPin = userPin; }
    public void setDepositAmount(int depositAmount) { this.depositAmount=depositAmount; }
    public void setCurrentBalance(double currentBalance) { this.currentBalance = currentBalance; }
    public void setCheckStatement(double checkStatement) { this.checkStatement = checkStatement;  }
    public void setSaveStatement(double saveStatement) { this.saveStatement = saveStatement; }

    public void setSavings(double savings) {
        this.savings = savings;
    }

//GETTERS:
    public int getUserPin() { return userPin; }
    public double getDepositAmount() { return depositAmount; }
    public double getCurrentBalance() { return currentBalance; }
    public double getCheckStatement() { return checkStatement; }
    public double getSaveStatement() { return saveStatement; }

    public double getSavings() {
        return savings;
    }


    // @Override
    // public void insertPin() {

    // }

    // @Override
    // void withDrawOption() {

    // }

    // @Override
    // void depositOption() {

    // }

    // @Override
    // void grabClientName() {

    // }

    // @Override
    // void grabTellerName() {

    // }

    // User Bankstatement
    public double bankStatement() {
        // double savings=1000.00;
        savings=1000.00;
        System.out.println("Current Balance (Checking): $" +savings);
        // System.out.println("Current Balance (Checking): $" +getCurrentBalance);
        return savings;
    }

    public double userWithdrawal(double withdrawAmount) {
        // double withdraw = withdrawAmount -savings;
        
        // System.out.println("Withdraw Amount: "+newBalance);
        // return newBalance;
        return savings - withdrawAmount;

        
    }

    // User Savings
    public static double userSavStment() {
        double savings=1000.00;
        System.out.println("Current Balance(Savings): $" +savings);
        return savings;
    }

    public String toString() {
        String resuls;
        // resuls = ""
        return results;
    }
}
