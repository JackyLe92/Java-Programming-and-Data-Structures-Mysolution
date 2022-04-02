/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringbuilderandbuffer;

/**
 *
 * @author levan
 */
public class StringBuilderAndBuffer {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder s1 = stringBuilder.append("Welcome");
    stringBuilder.append(" ");
    stringBuilder.append("to ");
    stringBuilder.append("Java.");
    
    
    stringBuilder.insert(5, " JavaScript And");
    stringBuilder.delete(0, 5);
    stringBuilder.deleteCharAt(stringBuilder.length() -1);
//    stringBuilder.reverse();
    stringBuilder.replace(5, 7, "LOVD");
    stringBuilder.setCharAt(1, 'P');
    
    
    
    
    System.out.println(stringBuilder);
  }
  
}
