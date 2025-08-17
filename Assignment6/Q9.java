// Find the Union and Intersaction of two sorted array.
import java.util.Scanner;
class Test{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array 1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("enter "+ n1 + " elements of array 1");
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("enter the size of array 2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n1];
        System.out.println("enter "+ n2 + " elements of array 1");
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

      
       
    }
}