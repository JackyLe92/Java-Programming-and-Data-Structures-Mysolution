/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountclass;
import java.util.Date;
/**
 *
 * @author levan
 */
public class Account {
  private int id;

  
  private double balance;
  private double annualInterestRate;
  private static Date dateCreated; // storing the date when the account was created
  
  // contructor 
  public Account (){
    Date date = new Date();
    this.dateCreated = date;
  }
  // Contructor specifies id and balance
  public Account (int id, double balance){
    this.id = id;
    this.balance = balance;
    Date date = new Date();
    this.dateCreated = date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  // stores the date when the account was created.
  public String getDateCreated() {
    return dateCreated.toString();
  }
  
  // Monthly interest rate = annualInterestRate(%)/ (100 * 12)
  public double getMonthlyInterestRate(){
    return (annualInterestRate / (12 * 100));
  }
  
  // Monthly interest
  public double getMonthlyInterest (){
    return balance * getMonthlyInterestRate();
  }
  
   // withdraw amount of money that return new balance of account
  public double withdraw(double moneyWithdraw){
    return this.balance -= moneyWithdraw;
  }
  
  // deposit method that will return new balance when add more money in account
  public double deposit(double money){
    return balance += money;
  }
}

