// 32. Given two arrays of integers A and B of sizes M and N respectively. Write a Write a java program, which will produce a third array named C. such that the following sequence is followed. 
// All even numbers of A from left to right are copied into C from left to right. 
// All odd numbers of A from left to right are copied into C from right to left. 
// All even numbers of B from left to right are copied into C from left to right. 
// All old numbers of B from left to right are copied into C from right to left.
// e.g., A is {3, 2, 1, 7, 6, 3} and B is {9, 3, 5, 6, 2, 8, 10} the resultant array C is {2, 6, 6, 2, 8, 10, 5, 3, 9, 3, 7, 1, 3} 

import java.util.Scanner;
class Test{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array A: ");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.println("enter "+ n1 + " elements of array A in decending order: ");
        for(int i=0; i<n1; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("enter the size of array B: ");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.println("enter "+ n2 + " elements of array B in decending order: ");
        for(int i=0; i<n2; i++){
            b[i] = sc.nextInt();
        }


        int c[] = new int[n1+n2];  // merge A and B in decending order
        
        //put element of array A
        int i = 0;
        int k = 0, l = c.length-1;
       while(i<a.length){
        if(a[i]%2 == 0) c[k++] = a[i++]; //even numbers : left to right
        else c[l--] = a[i++]; //odd numbers : right to left
       }

       //put element of array B
        i = 0;
        while(i<b.length){
            if(b[i]%2 == 0) c[k++] = b[i++]; //even numbers : left to right
            else c[l--] = b[i++]; //odd numbers : right to left
        }

        System.out.print("Array A: "); printArr(a);
        System.out.print("Array B: "); printArr(b);
        System.out.print("Array C: "); printArr(c);

    }
}