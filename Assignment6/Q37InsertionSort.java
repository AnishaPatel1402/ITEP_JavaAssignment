//Insertion sort : 

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

        //algorithm : 
        for(int i=0; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = key;
        }

        System.out.print("array after = ");
        printArr(arr);

    }
}