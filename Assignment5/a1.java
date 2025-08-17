//1. WAP to Enter n element in array and print array
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int array[] = new int [n];
        for(int i=0; i<n; i++){
            System.out.println("enter the element "+ (i+1));
            array[i] = sc.nextInt();
        }

        System.out.print("Data is : ");
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }
}