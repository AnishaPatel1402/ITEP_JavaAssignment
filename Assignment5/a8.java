//8. WAP to insert a element in array at specific position.

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int array[] = new int [n+1];

        System.out.println("enter the "+ n + " elements of array ");
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("enter the position on which you want to insert element");
        int pos = sc.nextInt();

        System.out.println("enter the element which you want to insert");
        int ele = sc.nextInt();

        //insertion
        if(pos > (n+1) || pos < 1) System.out.println("Invalid position");
        else{
            //shift all elements by one position
            int i;
            for(i=n; i>=pos; i--){
                array[i] = array[i-1];
            }
            array[pos-1] = ele;

            //second logic to shift elements
            // for(i=n-1; i>=pos-1; i--)
            // arr[i+1] = arr[i];
            
            //update size 
            n = n+1;
        }
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }
}