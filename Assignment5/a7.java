// 7. WAP to search an element in array using binary search.

//Binary search is a technique to search a element in an array but the condition is array should be in sorted order 

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int array[] = new int [n];
        System.out.println("enter all elements of array in sorted order : ");
        for(int i=0; i<n; i++){
            System.out.println("enter the element "+ (i+1));
            array[i] = sc.nextInt();
        }

        System.out.println("enter element to be searched = ");
        int ele = sc.nextInt();

        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(array[mid]==ele) System.out.print(ele+ " found at index "+ mid);
            else if(array[mid] > ele) high = mid-1;
            else low = mid+1;
        }
    }
}