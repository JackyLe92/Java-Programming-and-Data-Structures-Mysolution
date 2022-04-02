/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmiuseclass;

/**
 *
 * @author levan
 */
public class BMIUseClass {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
    System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
    
    BMI bmi2 = new BMI("Jacky Lee", 29, 180, 98);
    System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    
  }
  
}
