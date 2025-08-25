// Q.22) Java program to find nearest lesser and greater element in array
// Given an array of N elements and we have to find nearest lesser and nearest greater element using C program.
// Example:
//     Input:
//     Enter the number of elements for the arrray : 3  
//     Enter the elements for array_1.. 
//     array_1[0] : 1   
//     array_1[1] : 2   
//     array_1[2] : 3   
//     Enter the number : 2 
//     Output:
//     Element lesser than 2 is : 1 
//     Element greater than 2 is : 3

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

        System.out.println("enter the value of k: ");
        int k = sc.nextInt();

        //sort the array
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //now find k 
        int kIndex = -1;
        int low = 0, high = n-1;
        while(low < high){
            int mid = (low+high)/2;
            if(arr[mid]==target) {
                kIndex = mid;
                break;
            } else if(arr[mid] > )
        }

        printArr(arr);

    }
}
