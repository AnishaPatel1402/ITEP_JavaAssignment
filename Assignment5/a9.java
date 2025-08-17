//9. WAP to delete element from array at specific position.
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

        System.out.println("enter the position on which you want to delete element");
        int pos = sc.nextInt();
     
        //deletion of element
        if(pos > n || pos < 1) System.out.println("Invalid position");
        else{
            for(int i=pos; i<n; i++){
                array[i-1] = array[i];
            }
            array[n-1] = 0;
            n = n-1;  //update size
        }

        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }
}