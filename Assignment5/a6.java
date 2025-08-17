// 6. WAP to sort the array
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

        for(int i=0; i<n; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(array[j] < array[minIndex]) minIndex = j;
            }
            //swap
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
        
    }
}