/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integertesting;

/**
 *
 * @author levan
 */
public class MyInteger {
  private static int value;

  public MyInteger() {
  }
  public MyInteger(int number) {
    this.value = number;
  }

  public int getValue() {
    return value;
  }
  
  public static boolean isEven() {
    return (value % 2 == 0)? true: false;
  }
  
  public static boolean isOdd() {
    return !(value % 2 == 0)? true: false;
  }
  
  public static boolean isPrime() {
    if(value > 2){
      for(int i = 1; i < (value / 2 ); i++ ){
      if(value % i == 0){
        return false;
      } 
    }
    return true;
    } else return false;
    
    
  }
  
  public static boolean isEven(MyInteger integer) {
    return (integer.value % 2 == 0)? true: false;
  }
  
  public static boolean isOdd(MyInteger integer) {
    return !(integer.value % 2 == 0)? true: false;
  }
  
  public static boolean isPrime(MyInteger integer) {
    for(int i = 2; i < (integer.value / 2 ); i++ ){
      if(integer.value % i == 0){
        return false;
      } 
    }
    return true;
  }
  
  public boolean equals(int number) {
    return (this.value == number)? true: false;
  }
  
  public boolean equals(MyInteger integerNumber){
    return (this.value == integerNumber.value)? true: false;
  }
  
  public static int parseInt(String number){
    return Integer.valueOf(number);
  }
  
  public static int parseInt(MyInteger integerNumber){
    return integerNumber.value;
  }
  
  public static int[] parseInt(char[] charArr) {
    int[] numberArr = new int[charArr.length];
    int temp = 0;
    for(int i = 0; i < charArr.length; i++){
      numberArr[i] = Integer.valueOf(charArr[i]);
    }
    return numberArr;
  }
  
}
