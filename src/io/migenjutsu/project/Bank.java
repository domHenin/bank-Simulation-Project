package io.migenjutsu.project;

public abstract class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName=bankName;
    }


    abstract public void insertPin();
//  abstract void option();
    abstract void withDrawOption();
    abstract void depositOption();
    abstract void grabClientName();
    abstract void grabTellerName();


    public String toString() {
        return "Bank's Name: "+
                bankName;
    }
}
