import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the weight in kg:");
        double w= sc.nextDouble();
        System.out.print("Enter the height in meters:");
        double h= sc.nextDouble();
        double bmi=w/(Math.pow(h,2));
        String a="";
        if(bmi<18.5)
        {
            a="UnderWeight";
        }else if(bmi<24.9)
        {
            a="NormalWeight";
        }else if(bmi<29.9)
        {
            a="OverWeight";
        }else
            a="Obese";
        System.out.println("The person is "+a);
        sc.close();
    }
}