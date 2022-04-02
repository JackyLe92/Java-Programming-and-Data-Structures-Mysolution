/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testloanclass;
import java.util.Scanner;
/**
 *
 * @author levan
 */
public class TestLoanClass {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create Scanner;
    Scanner input = new Scanner(System.in);
    
    //Enter annual interest rate
    System.out.print("Enter annual interest rate, for example, 8.25: ");
    double annualInterestRate = input.nextDouble();
    
    // Enter numberOfYear
    System.out.print("Enter number of years as an integer: ");
    int numberOfYears = input.nextInt();
    
    // Enter loan amount 
    System.out.print("Enter loan amount, for example, 120000.95: ");
    double loanAmount = input.nextDouble();
    
    //Create Loan object
    LoanClass loan = new LoanClass(annualInterestRate, numberOfYears, loanAmount);
    
    // display loan date, monthly payment, and total payment
    System.out.printf("""
                      The loan was created on %S 
                      The monthly payment is %.2f
                      The total payment is %.2f
                      """, loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
  
  }
}