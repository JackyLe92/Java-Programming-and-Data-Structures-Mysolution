/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algebra_quadraticequations;

/**
 *
 * @author levan
 */
public class QuadraticEquation {
  private double a;
  private double b;
  private double c;

  public QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double getC() {
    return c;
  }
  // get value of b2 - 4ac
  public double getDiscriminant() {
    return Math.pow(b, 2) - (4 * a * c);
  }
  
  // getRoot1(), getRoot2()
  public double getRoot1(){
    if(getDiscriminant() > 0){
      return (-b + Math.sqrt(getDiscriminant())/  (2 * a));
    } else return 0;
  }
  public double getRoot2() {
    if(getDiscriminant() > 0){
      return (-b - Math.sqrt(getDiscriminant())/  (2 * a));
    } else return 0;
  }
  
}
