/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algebra_twoandtwoequations;

/**
 *
 * @author levan
 */
public class Algebra_TwoAndTwoEquations {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    LinearEquation testing = new LinearEquation(43, 31, 9, 5, 23, 87);
    System.out.println(testing.isSolvable());
    if(testing.isSolvable()){
      System.out.println("x is : " + testing.getX());
      System.out.println("y is : " + testing.getY());
      
    } else System.out.println("The equation has no solution.");
  }
  
}
