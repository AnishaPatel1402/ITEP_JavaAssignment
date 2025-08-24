// Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

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
        System.out.println("enter "+ n + " elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //method 1
        // printArr(arr);
        // int ans[] = new int[n];
        // //put first +ve element in array
        // int idx = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] > 0) ans[idx++] = arr[i];
        // }
        // //now put -ve elements in array
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] < 0) ans[idx++] = arr[i];
        // }
        // printArr(ans);


        //method 2
        printArr(arr);
        int i=n-1;
        while(i>=0){
            if(arr[i] < 0){//negative 
                for(int j=i+1; j<n && arr[j]>0; j++){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            i--;
        }


        //method 3
        // for(i=0; i<n; i++){
        //     for(int j=i; j<n-1; j++){
        //         if(arr[j] < arr[j+1]){  //wrong order swap them
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        printArr(arr);
    }
}