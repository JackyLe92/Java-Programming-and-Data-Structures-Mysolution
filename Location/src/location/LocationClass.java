/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package location;

/**
 *
 * @author levan
 */
public class LocationClass {
  public int row;
  public int column;
  public double maxValue;

  public LocationClass() {
  }
 
  public LocationClass(int row, int column){
    this.row = row;
    this.column = column;
  }
  
  public LocationClass locateLarget(double[][] arr){
    LocationClass maxNumber = new LocationClass();
    maxNumber.maxValue = arr[0][0];
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        if(arr[i][j] > maxNumber.maxValue){
          maxNumber.maxValue = arr[i][j];
          maxNumber.row = i;
          maxNumber.column = j;
          
        }
      }
    }
    return maxNumber;
  }
  
  
}
