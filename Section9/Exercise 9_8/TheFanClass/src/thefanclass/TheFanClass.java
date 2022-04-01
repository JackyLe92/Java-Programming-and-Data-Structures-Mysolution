/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thefanclass;

/**
 *
 * @author levan
 */
public class TheFanClass {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Fan testFan1 = new Fan();
    testFan1.setSpeed(testFan1.FAST);
    testFan1.setRadius(10);
    testFan1.setColor("Yellow ");
    System.out.println(testFan1.toString());
    
    Fan testFan2 = new Fan();
    testFan2.setSpeed(testFan2.MEDIUM);
    testFan2.setRadius(5);
    testFan2.setColor("Blue ");
    testFan2.setOn(true);
    System.out.println(testFan2.toString());
  }
  
}
