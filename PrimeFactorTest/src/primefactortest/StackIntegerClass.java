/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primefactortest;

/**
 *
 * @author levan
 */
public class StackIntegerClass {
  private int number;
  private int[] elements;
  private int size;

  public StackIntegerClass() {
    elements = new int[15];
  }
  public StackIntegerClass(int number) {
    this();
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public int getSize() {
    return size;
  }
  
  // Check if Stack is empty
  public boolean isEmpty() {
    if(elements.length == 0) {
      return true;
    }
    return false;
  }
  
  // peek the data from stack
  public int peek() {
    return elements[size - 1];
  }
  
  // pop 
  public int pop() {
    if(elements.length == 0){
      System.out.println("The Stack is empty");
      return 0;
    } else {
      return elements[--size];
    }
  }
  
  // push
  
  public void push(int number){
    if(size >= elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }
    elements[size++] = number;
  }

  public void display() {
    System.out.print("Smallest Factor of number is: ");
    for(int num:elements){
      if(num == 0){
        break;
      }
      System.out.print(num + ",");
    }
    System.out.println();
  }
  
  public void getSmallestFactor(){
    int tempValue = number;
    for( int i = 2; i <= number; i++){
      if(tempValue % i == 0) {
        tempValue /= i;
        push(i);
        i = 1;
        if(tempValue == 1) {
          break;
        }
      }
    }
    
  }
}
