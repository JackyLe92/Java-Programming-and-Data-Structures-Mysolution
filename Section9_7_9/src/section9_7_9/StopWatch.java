/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section9_7_9;
import java.util.Date;
/**
 *
 * @author levan
 */
public class StopWatch {
  private long startTime;
  private long endTime;
  
  // no args constructor set starttime == current time
  public StopWatch (){
    Date currentDate = new Date();
    this.startTime = currentDate.getTime();
  }
  
  // getter method
  public long getStartTime(){
    return this.startTime;
  }
  public long getEndTime(){
    return this.endTime;
  }
  
  // method start()that resets the startTime to the current time.
  public void start(){
    Date currentDate = new Date();
    this.startTime = currentDate.getTime();
  }
  
  // method stop() that sets the endTime to the current time
  public long stop(){
    Date currentDate = new Date();
    return this.endTime = currentDate.getTime();
  }
  
  // getElapsedTime()for the stop watch in milis
  public long getElapsedTime() {
    return this.endTime - this.startTime;
  }
}
