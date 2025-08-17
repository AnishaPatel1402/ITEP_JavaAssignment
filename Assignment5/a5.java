//5. WAP to replace all element with 0 which is multiple of 5
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
           if(array[i]%5==0){   //multiple of 5
                array[i] = 0;
           }
        }

        for(int i=0; i<n; i++){
            System.out.print(array[i]+ " ");
        }
    }
}