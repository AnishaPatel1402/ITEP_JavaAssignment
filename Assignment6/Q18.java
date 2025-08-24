// Q.18) Find largest sum contigeous sub array
// Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
// Example 1:
// Input:
// N = 5
// Arr[] = {1,2,3,-2,5}
// Output: 9

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

        int maxSum = arr[0];
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum > maxSum) maxSum = sum;
            }
        }
        System.out.println("Max sum is = "+ maxSum);

    }
}
