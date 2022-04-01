/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section9_7_9;
import java.util.Random;
/**
 *
 * @author levan
 */
public class Section9_7_9 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create arr 100.000 number by random
    int[] arrNumber = new int[1000];
    Random randomNumber = new Random(1000);
    
    for(int i = 0; i < arrNumber.length; i++){
      arrNumber[i] = randomNumber.nextInt(100000);
    }
    // Calculate the time to sort by selection sort
    StopWatch timeDelta = new StopWatch();
    
    for (int i = 0; i < arrNumber.length; i++){
      int temp = 0;
      for(int j = i + 1; j < arrNumber.length; j++){
        if (arrNumber[i] > arrNumber[j]){
          temp = arrNumber[i];
          arrNumber[i] = arrNumber[j];
          arrNumber[j] = temp;
        }
      }
    }
    timeDelta.stop();
    System.out.println("Time to sort 100000 number in array is " + timeDelta.getElapsedTime() + "mils");
    
//    for (int a:arrNumber){
//      System.out.println(a+ " _ ");
//    }
    
  }
  
}
