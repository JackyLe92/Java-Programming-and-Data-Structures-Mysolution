/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coursecasestudy;

/**
 *
 * @author levan
 */
public class CourseCaseStudy {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database Systems");
    
    course1.addStudent("Peter Jones");
    course1.addStudent("Kim Smith");
    course1.addStudent("Anne Kenedy");
    
    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");
    
    System.out.println("Number of students in course 1: " + course1.getNumberOfStudents());
    String[] students = course1.getStudents();
    for(int i = 0; i < course1.getNumberOfStudents(); i++) {
      if( i == (course1.getNumberOfStudents() - 1)){
        break;
      }
      System.out.println(students[i] + ", ");
    }
    System.out.println();
    System.out.println("Number of students in course2: " + course2.getNumberOfStudents());  
    
  }
  
}
