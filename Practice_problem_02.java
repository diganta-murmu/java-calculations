import java.util.Scanner;

public class Practice_problem_02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

    //Calculate leap year
        int year;
        System.out.print("Enter the year: ");
        year = sc.nextInt();
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("This is a leap year!!");
        }else System.out.println("This is not a leap year!!");


    //print even & odd series
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.println("Using for loop --------------->");
        for(int i=2; i<=n; i+=2) System.out.print(i+" ");
        System.out.println();
        for(int i=1; i<=n; i+=2) System.out.print(i+" ");
        System.out.println();
        System.out.println("Using while loop --------------->");
        int i = 2;
        while(i <= n){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();
        i = 1;
        while(i <= n){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();
        System.out.println("Using do while loop ------------->");
        i = 2;
        do{
            System.out.print(i+" ");
            i+=2;
        }while(i<=n);
        System.out.println();
        i = 1;
        do{
            System.out.print(i+" ");
            i+=2;
        }while(i<=n);


    //Calculate the sum of the series
        int k = n/2;
        System.out.println("Sum of even numbers: "+ k*(k+1));
        k = (n+1)/2;
        System.out.println("Sum of odd number: "+ k*k);
    }
}
