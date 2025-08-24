// Q.19) Find Maximum product contigeous sub array 
// Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.
// Example 1:
// Input:
// N = 5
// Arr[] = {6, -3, -10, 0, 2}
// Output: 180

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

        int maxProduct = arr[0];
        for(int i=0; i<n; i++){
            int product = 1;
            for(int j=i; j<n; j++){
                product *= arr[j];
                if(product > maxProduct) maxProduct = product;
            }
        }
        System.out.println("Max product is = "+ maxProduct);

    }
}
