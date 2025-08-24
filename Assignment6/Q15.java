//  Q.15
// Sub with equal 0s and 1s
// Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. 
// Example 1:
// Input:
// n = 7
// A[] = {1,0,0,1,0,1,1}
// Output: 8
// Explanation: The index range for the 8 
// sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
// (4, 5) ,(2, 5), (0, 5), (1, 6)

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

    //      for printing all subarrays
    //    for(int i=0; i<n; i++){
    //     for(int j=i; j<n; j++){
    //         for(int k=i; k<=j; k++) System.out.print(arr[k]+" ");
    //         System.out.println();
    //     }
    //    }

        int equalSubarray = 0;
       for(int i=0; i<n-1; i++){
         int one = 0, zero = 0;
         for(int j=i; j<n; j++){
            if(arr[j]==0) zero++;
            else one++;
            if(one == zero){
                equalSubarray++;
            }  
         }
       }
       System.out.println("Number of subarrays are = "+ equalSubarray);


    }
}