package io.migenjutsu.project;

public class Teller extends Bank {
    private double checkStatement;
    private double saveStatement;


    public Teller(double checkStatement, double saveStatement, String bankName) {
        super(bankName);
        this.checkStatement=checkStatement;
        this.saveStatement=saveStatement;
    }


// SETTERS:
    public void setCheckStatement(int checkStatement) { this.checkStatement=checkStatement; }
    public void setSaveStatement() { this.saveStatement=saveStatement; }

//GETTERS:
    public double getCheckStatement() { return checkStatement; }
    public double getSaveStatement() { return saveStatement; }
}
