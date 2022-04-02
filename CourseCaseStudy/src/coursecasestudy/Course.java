/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursecasestudy;

/**
 *
 * @author levan
 */
public class Course {
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;
  
  // constructor

  public Course(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseName() {
    return courseName;
  }
  
  
  public String[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }
  
  
  public void addStudent(String student) {
    this.students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  public void dropStudent(String student){
    
  }

}
