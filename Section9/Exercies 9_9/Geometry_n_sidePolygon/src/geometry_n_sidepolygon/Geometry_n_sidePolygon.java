/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometry_n_sidepolygon;

/**
 *
 * @author levan
 */
public class Geometry_n_sidePolygon {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    RegularPolygon regPolygon1 = new RegularPolygon();
    System.out.println("Area of regPolygon1 is " + regPolygon1.getArea());
    System.out.println("Perimeter of regPolygon1 is " + regPolygon1.getPerimeter());
    RegularPolygon regPolygon2 = new RegularPolygon(6, 4);
    System.out.println("Area of regPolygon2 is " + regPolygon2.getArea());
    System.out.println("Perimeter of regPolygon2 is " + regPolygon2.getPerimeter());
    RegularPolygon regPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
    System.out.println("Area of regPolygon3 is " + regPolygon3.getArea());
    System.out.println("Perimeter of regPo3ygon1 is " + regPolygon3.getPerimeter());
    
  }
  
}
  
  class  RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    
    // no-args constructor

    public  RegularPolygon() {
    }
    public RegularPolygon(int numberOfSide, double lengthOfSide){
      n = numberOfSide;
      side = lengthOfSide;
    }
    public RegularPolygon(int numberOfSide, double lengthOfSide, double x, double y){
      n = numberOfSide;
      side = lengthOfSide;
      this.x = x;
      this.y = y;
    }
    
    // setter and mutator 

    public int getN() {
      return n;
    }

    public void setN(int n) {
      this.n = n;
    }

    public double getSide() {
      return side;
    }

    public void setSide(double side) {
      this.side = side;
    }

    public double getX() {
      return x;
    }

    public void setX(double x) {
      this.x = x;
    }

    public double getY() {
      return y;
    }

    public void setY(double y) {
      this.y = y;
    }
    
    // getPerimeter() 
    public double getPerimeter(){
      return n * side;
    }
    
    // getArea()
    public double getArea(){
      return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
  }

