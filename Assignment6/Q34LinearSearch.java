//34. Write a java program to implement linear search
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to be searched = ");
        int target = sc.nextInt();

       //linear search
       int i=0;
       for(i=0; i<n; i++){
        if(arr[i]==target) {
            System.out.println(target +" found at index : "+ i); break;
        }
       }
       if(i>=n) System.out.println(target +" not found");
    }
}
