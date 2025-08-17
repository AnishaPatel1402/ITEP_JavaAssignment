//Find minimum and maximum element in array
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        }
        System.out.println("Minimum element = "+ min);
        System.out.println("Maximum element = "+ max);

    }
}