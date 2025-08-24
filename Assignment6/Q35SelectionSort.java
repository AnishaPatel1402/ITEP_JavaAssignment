//selection sort : 

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

        //algorithm : select the smallest element and swap it with first element in each iteration
        for(int i=0; i<n; i++){
            int smallIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[smallIndex]) smallIndex = j;
            }
            //now swap i with smallIndex
            int temp = arr[i];
            arr[i] = arr[smallIndex];
            arr[smallIndex] = temp;
        }

        System.out.print("array after = ");
        printArr(arr);

    }
}