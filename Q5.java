import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int X= sc.nextInt();
        System.out.print("sum of digits of"+X+"until the number is a"+"Single digit is"+Sum_of_Digits(X));
        sc.close();
    }

    public static int Sum_of_Digits(int n) {
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r;
            n/=10;
        }
        if (sum >=10)
            return Sum_of_Digits(sum);
        else
            return sum;
    }
}