// 33. Write a java program to impelment binary search algorithm
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements in sorted order = ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to be searched = ");
        int target = sc.nextInt();

        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target) {
                System.out.println(target +" found at index : "+ mid);
                break;
            }
            else if(target > arr[mid]) low = mid+1;
            else high = mid-1;
        }
        if(low > high) System.out.println("Not found");
    }
}
