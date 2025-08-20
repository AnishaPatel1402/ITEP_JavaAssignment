// Q.12
// Find common elements in three sorted arrays.
// Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
// Note: can you take care of the duplicates without using any additional Data Structure?
// Example 1:
// Input:
// n1 = 6; A = {1, 5, 10, 20, 40, 80}
// n2 = 5; B = {6, 7, 20, 80, 100}
// n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
// Output: 20 80

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array 1 = ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("enter "+ n1 + " elements of array 1 = ");
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

       System.out.print("enter size of array 2 = ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("enter "+ n2 + " elements of array 2 = ");
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        
        System.out.print("enter size of array 3 = ");
        int n3 = sc.nextInt();
        int arr3[] = new int[n3];
        System.out.println("enter "+ n3 + " elements of array 3 = ");
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        //common element in three arrays
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                if(arr1[i]==arr2[j]){
                    for(int k=0; k<n3; k++){
                        if(arr1[i]==arr3[k])  System.out.print(arr1[i]+" ");
                    }
                }
            }
        }

    }
}
