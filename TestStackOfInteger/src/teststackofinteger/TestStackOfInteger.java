/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststackofinteger;

import java.awt.BorderLayout;

/**
 *
 * @author levan
 */
public class TestStackOfInteger {
  private String text;
  public TestStackOfInteger(String s) {
    String text = s;
  }
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    StackInteger firstStack = new StackInteger();
    
    for (int i = 0; i < 20; i++){
      firstStack.push(i);
    }
    while(!firstStack.empty()){
      System.out.println(firstStack.pop());
    }
   
    
    
  }
  
  
}
