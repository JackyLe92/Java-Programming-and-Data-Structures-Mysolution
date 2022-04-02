/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timetesing;

/**
 *
 * @author levan
 */
public class Time {
  private int hours;
  private int minutes;
  private int seconds;

  public Time() {
    // obtain the total milliseconds since midnight, Jan 1, 1970
    long totalMilliseconds = System.currentTimeMillis();
    // get second
    long currentSecond = (totalMilliseconds / 1000) % 60;
    this.seconds = (int) currentSecond;
    // get minute
    long currentMinute = ((totalMilliseconds/ 1000) / 60) % 60;
    this.minutes = (int) currentMinute;
    //get hours GMT + 7
    long currentHours = (((totalMilliseconds/ 1000) / 60 / 60) % 24) + 7;
    this.hours = (int) currentHours;
  }
  
  public Time(int hour, int minute, int second) {
    this.hours = hour;
    this.minutes = minute;
    this.seconds = second;
  }

  public int getHours() {
    return hours;
  }

  public int getMinutes() {
    return minutes;
  }

  public int getSeconds() {
    return seconds;
  }
  
  public Time setTime(long amountOfSecond){
    // method will receive elapsed time and return specific time: hour-minute-second
    Time getTime = new Time();
    long currentSecond = (amountOfSecond / 1000) % 60;
    long currentMinute = ((amountOfSecond/ 1000) / 60) % 60;
    long currentHours = (((amountOfSecond/ 1000) / 60 / 60) % 24) + 7;
    getTime.hours = (int) currentHours;
    getTime.minutes = (int) currentMinute;
    getTime.seconds = (int) currentSecond;
    return getTime;
  }
  
  public void displayTime() {
    System.out.printf("Time is: %d:%d:%d", this.hours, this.minutes, this.seconds);
    System.out.println();
  }
  
}
