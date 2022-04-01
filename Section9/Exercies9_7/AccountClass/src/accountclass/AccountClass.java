/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accountclass;
import java.util.Date;
/**
 *
 * @author levan
 */
public class AccountClass {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Account account = new Account(1122, 20000);
    account.setAnnualInterestRate(4.5);
    account.withdraw(2500);
    account.deposit(3000);
    System.out.println("Balance of account is " + account.getBalance());
    System.out.println("Monthly interest is " + account.getMonthlyInterest());
    System.out.println("Accoutn was created by " + account.getDateCreated());

  }
  
}
