// Q.16
// Rearrange the array in alternating positive and negative items
// Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
// Note: Array should start with positive number.

// Example 1:
// Input: 
// N = 9
// Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
// Output:
// 9 -2 4 -1 5 -5 0 -3 2
import java.util.ArrayList;
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements postive and negative both ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i] >= 0) positive.add(arr[i]);
            else negative.add(arr[i]);
        }
        boolean flag = true;
        //fill +ve and -ve elements from arraylist alternatingly
        int i = 0, j = 0 , idx = 0;
        while(i<positive.size() && j<negative.size()){
            if(flag){  //fill +ve
                arr[idx] = positive.get(i);
                idx++;
                i++;
                flag = false;
            } else{ //fill -ve
                arr[idx] = negative.get(j);
                idx++;
                j++;
                flag = true;
            }
        }
        
        //+ve elements are remaining
        while(i<positive.size()){
            arr[idx] = positive.get(i);
            idx++;
            i++;
        }

        //-ve elements are remaining
        while(j<negative.size()){
            arr[idx] = negative.get(j);
            idx++;
            j++;
        }

        for(i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}