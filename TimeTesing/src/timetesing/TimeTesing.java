/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timetesing;

import java.math.BigInteger;

/**
 *
 * @author levan
 */
public class TimeTesing {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Time time1 = new Time();
    time1.displayTime();
    
    Time time2 = new Time(5, 23, 55);
    time2.displayTime();
    
    Time time3 = time1.setTime(555550000);
    time3.displayTime();
    
    
    /* 
    Time is: 21:40:8
    Time is: 5:23:55
    Time is: 17:19:10
    */
  }
  
}
