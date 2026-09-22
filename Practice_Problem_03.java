import java.util.Scanner;
import java.util.Arrays;


public class Practice_Problem_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    //Print Avarage:
        int n1; 
        System.out.print("Enter n1: ");
        n1 = sc.nextInt();

        int [] arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr1[i] = sc.nextInt();
        }
        int total = 0;
        for(int i=0; i<n1; i++){
            total += arr1[i];
        }
        System.out.println("Avarage is: "+(double)total/n1);

    //Give Medel or not
        int semisterNumber;
        System.out.print("Enter Semister Number: ");
        semisterNumber = sc.nextInt();
        
        if(semisterNumber == 8){
            double grade;
            System.out.print("Enter Grade: ");
            grade = sc.nextDouble();

            if(grade >= 3.50 && grade <= 4.00){
                System.out.println("Complete the Semister and get Gold:)");
            }else if(grade < 3.50 && grade >= 0.00){
                System.out.println("Complete the Semister but not get Gold:(");
            }else{
                System.out.println("INVALID GRADE!!");
            }
        }else if(semisterNumber < 8 && semisterNumber >= 0){
            System.out.println("Not Complete the Semister:|");
        }else{
            System.out.println("INVALID SEMISTER!!");
        }


    //Giving Bonus:
        double attendance; 
        System.out.print("Enter Attendance in Parsentage: ");
        attendance = sc.nextDouble();
        double reached; 
        System.out.print("Enter Reached in Parsentage: ");
        reached = sc.nextDouble();
        
        if(attendance == 100){
            if(reached == 95){
                System.out.println("60% Bonus!!");
            }else if(reached == 80){
                System.out.println("40% Bonus!!");
            }else{
                System.out.println("5% Bonus!!");
            }
        }else if(attendance == 90){
             if(reached == 95){
                System.out.println("60% Bonus!!");
            }else if(reached == 80){
                System.out.println("40% Bonus!!");
            }else{
                System.out.println("5% Bonus!!");
            }
        }else{
            System.out.println("5% Bonus!!");
        }


    //Greatest Number:
        int n2; 
        System.out.print("Enter n2: ");
        n2 =  sc.nextInt();
        int [] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            System.out.print("Enter "+(i+1)+"element: ");
            arr2[i] = sc.nextInt();
        }   
        int greatestNumber = 0;
        for(int i=0; i<n2; i++){
            if(arr2[i] > greatestNumber){
                greatestNumber = arr2[i];
            }
        }
        System.out.println("Greatest Number: "+ greatestNumber);
    

    //Prime Number:
        int p; 
        System.out.print("Enter p: ");
        p = sc.nextInt();
        boolean isPrime = true;
        if(p<2) isPrime = false;
        else{
            for(int i=2; i*i<=p; i++){
                if(p%i == 0) isPrime = false;
            }
            if(isPrime) System.out.println("Prime!!");
            else System.out.println("Not Prime!!");
        }


    //Revarse Array: 
        int n3; 
        System.out.print("Enter n3; ");
        n3 = sc.nextInt();
        int [] arr3 = new int[n3];
        for(int i=0; i<n3; i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr3[i] = sc.nextInt();
        }
        System.out.println("Befor Revarsing: ");
        for(int i=0; i<n3; i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        int l = 0, r = n3-1;
        while(r-l >= 1){
          int temp = arr3[l];
          arr3[l] = arr3[r];
          arr3[r] = temp;
          l++; r--;
        }
        System.out.println("After Revarsing: ");
        for(int i=0; i<n3; i++){
          System.out.print(arr3[i]+" ");
        }
        System.out.println();


    //count odd and even: 
        int n4; 
        System.out.print("Enter n4: ");
        n4 = sc.nextInt();
        int [] arr4 = new int[n4];
        for(int i=0; i<n4; i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr4[i] = sc.nextInt();
        }
        int odd = 0, even = 0;
        for(int i=0; i<n4; i++){
            if(arr4[i] % 2 == 0) even++;
            else odd++;
        } 
        System.out.println("ODD: "+odd);
        System.out.println("EVEN: "+even);


    //Fibonacci series:
        int n5; 
        System.out.print("Enter n5: ");
        n5 = sc.nextInt();
        int [] arr5 = new int[n5];
        arr5[0] = 0;
        arr5[1] = 1;
        for(int i=2; i<n5; i++){
            arr5[i] = arr5[i-1] + arr5[i-2];
        }
        System.out.print("Fibonacci series: ");
        for(int i=0; i<n5; i++){
            System.out.print(arr5[i]+" ");
        }
        System.out.println();
    }


}
