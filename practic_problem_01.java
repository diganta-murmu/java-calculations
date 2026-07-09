import java.util.Scanner;

public class practic_problem_01 {
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

   //area of a triangle 1
    double base, haight;

    System.out.print("Enter base: ");
    base = sc.nextDouble();
    System.out.print("Enter Height: ");
    haight = sc.nextDouble();

    double area_triangle_1 = (0.5) * base * haight;
    System.out.print("The area of the triangle is: "+area_triangle_1);


   //volume of a ball
      double pi = 3.1416, radius_ball;

      System.out.print("Enter the radius of ball: ");
      radius_ball = sc.nextDouble();

      double volume = (4/3)* pi * Math.pow(radius_ball,2);
      System.out.print("The volume of a the ball is: "+volume);


   //area of a circle
      double radius_circle;

      System.out.print("Enter the radius of circle: ");
      radius_circle = sc.nextDouble();

      double area_circle = pi* Math.pow(radius_circle, 2);
      System.out.print("The area of the circle is: "+area_circle);


   //Celsius to Fahrenheit
      double celsius;

      System.out.print("Enter the tempereture in celsius: ");
      celsius = sc.nextDouble();

      double Fahrenheit = ((9*celsius)/5.0 + 32);
      System.out.print("The temperature in Fahrenheit is: "+Fahrenheit);


   //area of a equilateral triangle
      double arm;

      System.out.print("Enter the arm of the equilateral triangle: ");
      arm = sc.nextDouble();

      double area_equilateral_triangle = (Math.pow(3.0, 0.5)/4)* Math.pow(arm,2);
      System.out.print("The area of the equilateral triangel is: "+area_equilateral_triangle);


   //area of a triangle 2
      double a,b,c;

      System.out.print("Enter a: ");
      a = sc.nextDouble();

      System.out.print("Enter b: ");
      b = sc.nextDouble();

      System.out.print("Enter c: ");
      c = sc.nextDouble();

      double s = (a+b+c)/2;

      double area_triangle_2 = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.print("The area of the triangle is: "+area_triangle_2);

   } 
}
