/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displaycurrenttime;

/**
 *
 * @author levan
 */
public class DisplayCurrentTime {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // obtain the total milliseconds since midnight, Jan 1, 1970
    long totalMilliseconds = System.currentTimeMillis();
    // get second
    long currentSecond = (totalMilliseconds / 1000) % 60;
    System.out.println(currentSecond);
    long currentMinute = ((totalMilliseconds/ 1000) / 60) % 60;
    System.out.println(currentMinute);
    long currentHours = ((totalMilliseconds/ 1000) / 60 / 60) % 24;
    System.out.println(currentHours + 7);
  }
  
}
