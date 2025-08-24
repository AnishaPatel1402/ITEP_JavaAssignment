//Bubble sort : 

import java.util.Scanner;
class Test{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("array before = ");
        printArr(arr);

        //algorithm : push the largest element at the end in each iteration
        for(int i=0; i<n-1; i++){
            int swap = 0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){  //wrong order swap them
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break;  //means array is sorted 
            // System.out.println(swap);
        }

        System.out.print("array after = ");
        printArr(arr);

    }
}