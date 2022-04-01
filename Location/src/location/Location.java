/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package location;
import java.util.Scanner;
/**
 *
 * @author levan
 */
public class Location {

  /**
   * @param args the command line arguments
   */
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Enter numberOfRow, Column
    System.out.print("Enter the number of rows and columns int the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    // Create Array;
    double[][] arr = new double[row][column];
    createArray(arr, row, column);
   
//    for(int i = 0; i < row; i++){
//      for(int j = 0; j < column; j++){
//        System.out.print(arr[i][j]);
//      }
//      System.out.println();
//    }
//    
    LocationClass maxNumberLocate = new LocationClass();
    LocationClass foundOject = maxNumberLocate.locateLarget(arr);
    System.out.println("Max value in multiple array is: " + foundOject.maxValue);
    System.out.println(foundOject.row);
    System.out.println(foundOject.column);
    
    
  }
  
  // Method to create the multiple array
  public static void createArray(double [][] arr, int row, int column) {
    System.out.println("Enter the array: ");
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < row; i++){
      for(int j = 0; j < column; j++){
        arr[i][j] = input.nextDouble();
      }
    }
  }
  
}
