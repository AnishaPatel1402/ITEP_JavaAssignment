//Write a program to reverse the array.

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
        
        //method 1
        // int reversArr[] = new int[n];
        // for(int i=0; i<n; i++){
        //     reversArr[n-i-1] = arr[i];
        // }
        // System.out.print("Reverse array = ");
        // for(int i=0; i<n; i++){
        //     System.out.print(reversArr[i]+" ");
        // }
        

        //method 2 : swapping
        int start = 0, end = n-1; 
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reverse array = ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}