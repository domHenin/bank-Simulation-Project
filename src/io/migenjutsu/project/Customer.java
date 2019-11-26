package io.migenjutsu.project;

public class Customer extends Bank {
    private int userPin;
    private int depositAmount;
    private double checkStatement;
    private double saveStatement;

    public Customer(int userPin, int depositAmount, double checkStatement, double saveStatement, String bankName) {
        super(bankName);
        setUserPin(userPin);
        setDepositAmount(depositAmount);
        this.checkStatement=checkStatement;
        this.saveStatement=saveStatement;

    }


// SETTERS:
    public void setUserPin(int userPin) { this.userPin = userPin; }
    public void setDepositAmount(int depositAmount) { this.depositAmount=depositAmount; }
    public void setCheckStatement(double checkStatement) { this.checkStatement = checkStatement;  }
    public void setSaveStatement(double saveStatement) { this.saveStatement = saveStatement; }

//GETTERS:
    public int getUserPin() { return userPin; }
    public int getDepositAmount() { return depositAmount; }
    public double getCheckStatement() { return checkStatement; }
    public double getSaveStatement() { return saveStatement; }


    @Override
    public void insertPin() {

    }

    @Override
    void withDrawOption() {

    }

    @Override
    void depositOption() {

    }

    @Override
    void grabClientName() {

    }

    @Override
    void grabTellerName() {

    }

    // User Bankstatement
    public static double bankStatement() {
        System.out.println("Current Balance (Checking): $" +getCheckStatement);
        return getCheckStatement;
    }

    //        User Savings
    public static double userSavStment() {
        System.out.println("Current Balance(Savings): $" +getSaveStatment);
        return getSaveStatment;
    }

    public String toString() {
        String resuls;
        // resuls = ""
        return results;
    }
}
