/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypointtesting;

/**
 *
 * @author levan
 */
public class MyPoint {
  private double x;
  private double y;
  

  public MyPoint() {
    this.x = 0;
    this.y = 0;
  }
  
  public MyPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
  
  //distance from point to center (0,0)
  public double distance(){
    return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)); 
  }
  
  // between two point
  public double distance(MyPoint myPoint) {
    double temp = Math.pow(myPoint.x - this.x, 2) + Math.pow(myPoint.y - this.y, 2);
    return Math.sqrt(temp);
  }
  
  
  //static method that not need create the object
  public static double distance(MyPoint p1, MyPoint p2) {
    double temp = Math.pow(p1.x - p1.y, 2) + Math.pow(p1.y - p1.y, 2);
    return Math.sqrt(temp);
  }
  
}
