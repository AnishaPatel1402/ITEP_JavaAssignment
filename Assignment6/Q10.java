//Write a program to cyclically rotate array by one.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //bring the first element to last and shift all other element one place before
        for(int i=1; i<n; i++){
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp; 
        }
        System.out.print("array after rotating = ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}