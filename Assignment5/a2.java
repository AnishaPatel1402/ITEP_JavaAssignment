//2. WAP to program to calculate the sum of all element of array.
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

        int sumOfElements = 0;
        for(int i=0; i<n; i++){
           sumOfElements += array[i];
        }
        System.out.print("Sum of array elements is: "+ sumOfElements);

    }
}