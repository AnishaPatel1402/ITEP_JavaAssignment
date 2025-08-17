//Find occurance of an integer number in array.
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
        
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int occurance = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == num) occurance++;
        }

        System.out.println("Occurence of "+ num+ " is = "+ occurance);

    }
}