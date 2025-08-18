// Q.14. Find the first non-repeating elment in given array of integers
// Find the first non-repeating element in a given array arr of N integers.
// Note: Array consists of only positive and negative integers and not zero.
// Example 1:
// Input : arr[] = {-1, 2, -1, 3, 2}
// Output : 3

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
        
        boolean repeated[] = new boolean[n];
        for(int i=0; i<n; i++){
            if(repeated[i]) continue;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                   repeated[i] = true;
                   repeated[j] = true;
                }
            }
        }
        //when first false incountered that will be non repeating number
        for(int i=0; i<n; i++){
            if(repeated[i]==false){
                System.out.println("first non repeating number is = "+ arr[i]);
            }
        }
    }
}
