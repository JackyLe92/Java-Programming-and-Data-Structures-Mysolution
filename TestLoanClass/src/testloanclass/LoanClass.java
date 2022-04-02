/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testloanclass;

import java.util.Date;

/**
 *
 * @author levan
 */
public class LoanClass {
  private double annualInterestRate;
  private int numberOfYear;
  private double loanAmount;
  Date loanDate = new Date();

  public LoanClass() {
  }

  public LoanClass(double annualInterestRate, int numberOfYear, double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYear = numberOfYear;
    this.loanAmount = loanAmount;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public int getNumberOfYear() {
    return numberOfYear;
  }

  public void setNumberOfYear(int numberOfYear) {
    this.numberOfYear = numberOfYear;
  }

  public double getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }

  public Date getLoanDate() {
    return loanDate;
  }
  
  public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12)));
    return monthlyPayment;
  }
  
  public double getTotalPayment () {
    double totalPayment = getMonthlyPayment() * numberOfYear * 12;
    return totalPayment;
  }
}
