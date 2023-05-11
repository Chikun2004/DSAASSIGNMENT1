import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double arr[][] =new double[4][4];
        System.out.print("Enter a  3-by-4 Matrix row  by row:");
        for (int i=0;i<3;i++)
            for (int j=0;j<4;j++)
                arr[i][j]= sc.nextDouble();
        for(int k=0;k<4;k++)
            System.out.println("sum of the elements at column"+k+"is"+sumColumn(arr,k));
        sc.close();
    }
    static double sumColumn(double[][]m,int ColumnIndex){
        double sum= 0;
        for (int i=0;i<4;i++)
            for (int j=0;j<4;j++)
                if (j== ColumnIndex)
                    sum+=m[i][j];
        return sum;
    }
}