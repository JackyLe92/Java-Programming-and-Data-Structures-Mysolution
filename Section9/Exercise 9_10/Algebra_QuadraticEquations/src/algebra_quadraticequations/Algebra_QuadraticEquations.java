/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algebra_quadraticequations;
import java.util.Scanner;
/**
 *
 * @author levan
 */
public class Algebra_QuadraticEquations {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Enter number for the Quadratic ");
    Scanner input = new Scanner (System.in);
    // create QuadraticEquation class
    
    System.out.print("Enter number for a: ");
    int a = input.nextInt();
    System.out.print("Enter number for b: ");
    int b = input.nextInt();
    System.out.print("Enter number for c: ");
    int c = input.nextInt();
    QuadraticEquation testingQuadratic = new QuadraticEquation(a, b, c);
    
    if(testingQuadratic.getDiscriminant() > 0) {
      System.out.println("Root1 is " + testingQuadratic.getRoot1() + "\n" +
              "Root2 is " + testingQuadratic.getRoot2());
    } else if(testingQuadratic.getDiscriminant()== 0){
      System.out.println("Root is " + testingQuadratic.getRoot1());
    } else {
      System.out.println("The equation has no roots.");
    }
  }
  
}
