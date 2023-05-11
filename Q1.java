package HOMEASSIGNMENT1;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st integer:");
        int a=sc.nextInt();
        System.out.print("Enter 2nd integer:");
        int b=sc.nextInt();
        System.out.print("Enter 3rd integer:");
        int c=sc.nextInt();
        if (a+b==c && b-c==a && a*b==c){
            System.out.println("The number can be used in a correct arithmetic formula:");
        }else
            System.out.println("The number cannot be used in a correct arithmetic formula:");
        sc.close();
    }
}
