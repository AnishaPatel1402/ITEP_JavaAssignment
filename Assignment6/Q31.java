// 31. Suppose X. Y, Z are arrays of integers of size M, N, and M + N respectively. The numbers in array X and Y appear in descending order. Write a java program to produce third array Z by merging arrays X and Y in descending order.
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
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i] > b[j]) c[k++] = a[i++];
            else  c[k++] = b[j++];
        }

        //element of A are remaining
        while(i<a.length) c[k++] = a[i++];
        //element of B are remaining
        while(j<b.length) c[k++] = b[j++];

        System.out.print("Array A: "); printArr(a);
        System.out.print("Array B: "); printArr(b);
        System.out.print("Array C: "); printArr(c);

    }
}