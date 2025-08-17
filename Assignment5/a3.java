//3. WAP to program calaculate the sum of all even element and all odd element of array
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

        int even = 0, odd = 0;
        for(int i=0; i<n; i++){
            if(array[i]%2==0) even += array[i];
            else odd += array[i];
        }
        System.out.print("Even elements sum = "+ even);
        System.out.print("Odd elements sum = "+ odd);
    }
}