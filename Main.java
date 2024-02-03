import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        int add=0;
        for(int i=0;i<arr.length;i++)
        {
        
            arr[i]= sc.nextInt();
            if(arr[i]%2==0)
            {
                System.out.println(arr[i] +"is even");
            }
            else{
                System.out.println(arr[i]+ " is odd");
            }
        }
        
    }

    
}
