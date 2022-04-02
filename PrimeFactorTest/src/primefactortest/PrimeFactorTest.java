/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primefactortest;
import java.util.Scanner;

/**
 *
 * @author levan
 */
public class PrimeFactorTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    
    StackIntegerClass tes1 = new StackIntegerClass(number);
    tes1.getSmallestFactor();
    tes1.display();
  }
  
}
