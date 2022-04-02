/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teststackofinteger;

/**
 *
 * @author levan
 */
public class StackInteger {
  private int[] elements;
  private int size;
  
  public static final int DEFAULT_CAPACITY = 16;

  public StackInteger() {
    this(DEFAULT_CAPACITY);
  }
  
  public StackInteger(int capacity) {
    elements = new int[capacity];
  }
  
  public boolean empty(){
    return size == 0;
  }
  
  public int getSize() {
    return this.size;
  }
  
  public int peek() {
    return elements[size-1];
  }
  
  public int pop(){
    return elements[--size];
  }
  
  public int push(int number) {
    if(size >= elements.length) {
      int[] newStack = new int[elements.length * 2];
      System.arraycopy(elements, 0, newStack, 0, elements.length);
      elements = newStack;
    }
    return elements[size++] = number;
  }
  
  
}
