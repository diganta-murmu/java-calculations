import java.util.Scanner;

public class area_of_a_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 3.0, b = 4.0, c = 5.0;
        double s = (a + b + c) / 2; // Corrected: divided by 2
        double areaHeron = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Heron's Area: " + areaHeron);;
    }
}