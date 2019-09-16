package io.migenjutsu.project;

public class Customer extends Bank {
    private int userPin;
    private int depositAmount;

    public Customer(int userPin, int depositAmount, String bankName) {
        super(bankName);
        setUserPin(userPin);
        setDepositAmount(depositAmount);
    }


// SETTERS:
    public void setUserPin(int userPin) { this.userPin = userPin; }
    public void setDepositAmount(int depositAmount) { this.depositAmount=depositAmount; }

//GETTERS:
    public int getUserPin() { return userPin; }
    public int getDepositAmount() { return depositAmount; }


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
}
