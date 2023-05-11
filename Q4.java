package HOMEASSIGNMENT1;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of row and column:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double x[][] = new double[m][n];
        double y[][] = new double[m][n];
        double z[][] = new double[m][n];
        System.out.println("Enter elements of first element:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                x[i][j] = sc.nextDouble();
        System.out.println("Enter elements of second element:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                y[i][j] = sc.nextDouble();
        System.out.println("The addition of two array is:");
        z = addMatrix(x, y);
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                System.out.print(z[i][j] + " ");
        System.out.println();
    }
    static double[][] addMatrix(double[][]a,double[][]b){
    int row =a.length;
    int column=a[0].length;
    double sum[][]=new double[row][column];
    for (int i=0;i<row;i++)
        for (int j=0;j<column;j++)
            sum[i][j]=a[i][j]+b[i][j];
    return sum;
   }
}