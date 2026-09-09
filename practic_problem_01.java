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
    System.out.println("The area of the triangle is: "+area_triangle_1);


   //volume of a ball
      double pi = 3.1416, radius_ball;

      System.out.print("Enter the radius of ball: ");
      radius_ball = sc.nextDouble();

      double volume = (4/3)* pi * Math.pow(radius_ball,2);
      System.out.println("The volume of a the ball is: "+volume);


   //area of a circle
      double radius_circle;

      System.out.print("Enter the radius of circle: ");
      radius_circle = sc.nextDouble();

      double area_circle = pi* Math.pow(radius_circle, 2);
      System.out.println("The area of the circle is: "+area_circle);


   //Celsius to Fahrenheit
      double celsius;

      System.out.print("Enter the tempereture in celsius: ");
      celsius = sc.nextDouble();

      double Fahrenheit = ((9*celsius)/5.0 + 32);
      System.out.println("The temperature in Fahrenheit is: "+Fahrenheit);


   //area of a equilateral triangle
      double arm;

      System.out.print("Enter the arm of the equilateral triangle: ");
      arm = sc.nextDouble();

      double area_equilateral_triangle = (Math.pow(3.0, 0.5)/4)* Math.pow(arm,2);
      System.out.println("The area of the equilateral triangel is: "+area_equilateral_triangle);


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
      System.out.println("The area of the triangle is: "+area_triangle_2);


   //Positive or Nagetive even or odd
      int number;
      System.out.print("enter the number: ");
      number = sc.nextInt();
      if(number >= 0 && number%2 == 0){
         System.out.println("The number is Possitive and even!!");
      }else if(number < 0 && number%2 == 0){
         System.out.println("The number is Negative and even!!");
      }else if(number >= 0 && number%2 != 0){
         System.out.println("The number is Possitive and odd!!");
      }else{
         System.out.println("The number is Negative and odd!!");
      }


   //calculate grade
      int mark;
      System.out.print("Enter the mark: ");
      mark = sc.nextInt();
      if(mark >= 0 && mark <= 39) System.out.println("GRADE: F");
      else if(mark >= 40 && mark <= 59) System.out.println("GRADE: C+");
      else if(mark >= 60 && mark <= 69) System.out.println("GRADE: B");
      else if(mark >= 70 && mark <= 79) System.out.println("GRADE: A-");
      else if(mark >= 80 && mark <= 89) System.out.println("GRADE: A");
      else if(mark >= 90 && mark <= 100) System.out.println("GRADE: A+");
      else System.out.println("Invalid mark!!");

   
   //Simple Calculator
      int number1, number2; 
      char operator;
      System.out.print("Enter Number 1: ");
      number1 = sc.nextInt();
      System.out.print("Enter Number 2: ");
      number2 = sc.nextInt();
      System.out.print("Enter what you want to do('+', '-', '*', '/'): ");
      operator = sc.next().charAt(0);
      if(operator == '+') System.out.println("Ans: "+(number1+number2));
      else if(operator == '-') System.out.println("Ans: "+(number1-number2));
      else if(operator == '*') System.out.println("Ans: "+(number1*number2));
      else if(operator == '/') System.out.println("Ans: "+((double)number1/number2));
      else System.out.println("You can enter only '+', '-', '*' or '/'");
      
   } 
}
