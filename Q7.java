import java.util.Scanner;
public class Q7
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements in the array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter elements in the array ");
        for(int i =0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int max_count=0;
        int min_count=0;
        int max_first_occurs=0;
        int min_last_occurs=0;
        for(int i=0;i<n;i++) {
            if(arr[i]>max) {
               max= arr[i];
            }
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        for(int i=0;i < n;i++) {
            if(arr[i]==max) {
                max_count++;
            }
            if(max_count==1) {
                max_first_occurs =i+1;
            }
            if(arr[i]==min) {
                min_count++;
                min_last_occurs=i+1;
            }
        }
        System.out.println("Maximum element of Array"+"is"+max+"and occurs"+max_count+"times.");
        System.out.println("Minimum element of Array"+"is"+min+"and occurs"+min_count+"times.");
        System.out.println("First Occurrence of maximum element"+"is at position"+max_first_occurs+".");
        System.out.println("Last Occurrence of minimum element"+"is at position"+min_last_occurs+".");

    }
}