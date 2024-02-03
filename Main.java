import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        int add=0;
        for(int i=0;i<arr.length;i++)
        {
        
            arr[i]= sc.nextInt();
            add = add+arr[i];
        }
        System.out.println("\nThe sum of  array is : "+ add);
    }

    
}
