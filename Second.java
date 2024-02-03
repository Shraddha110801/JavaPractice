import java.util.Scanner;
public class Second{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i]=sc.nextInt();

        }

        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("min element is "+ min);      
    }
}