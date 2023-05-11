import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int X = sc.nextInt();
        System.out.println(X+"is odd:"+isodd(X));
        sc.close();
    }
    static boolean isodd(int n){
        int b=n&1;
        if (b==0)
            return false;
        else
            return true;
    }
}