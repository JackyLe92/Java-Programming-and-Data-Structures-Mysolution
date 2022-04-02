/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integertesting;

/**
 *
 * @author levan
 */
public class IntegerTesting {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    MyInteger num1 = new MyInteger(2);
    System.out.println(num1.isEven());
    System.out.println(num1.isOdd());
    System.out.println(num1.isPrime());
    
    
    System.out.println(num1.isEven(num1));
    
  }
  
}
