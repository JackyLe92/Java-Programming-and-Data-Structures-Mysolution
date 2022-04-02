/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mypointtesting;

/**
 *
 * @author levan
 */
public class MyPointTesting {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    MyPoint center = new MyPoint();
    MyPoint p1 = new MyPoint(2.0, 3.5);
    MyPoint p2 = new MyPoint(6.0, 7.5);
    MyPoint p3 = new MyPoint(1.0, 8.5);
    
    System.out.println(p1.distance());
    System.out.println(p1.distance(p2));
    System.out.println(p2.distance(p3));
    
    MyPoint.distance(p1, p2);
    
    System.out.println(p1.getX());
    System.out.println(p1.getY());
  }
  
}
