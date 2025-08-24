// Q.17 Find it there is any subarray with sum equals to zero
// Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
// Example 1:
// Input:
// 5
// 4 2 -3 1 6
// Output: 
// Yes

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

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum==0){
                    System.out.print("subarray whose sum is 0 = ");
                    for(int k=i; k<=j; k++) System.out.print(arr[k]+" ");
                    break;
                }
            }
        }
    }
}
