// Q.13 Find the first repeating element in array of integers
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            boolean repeated = false;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    repeated = true;
                    break;
                }
            }
            if(repeated){
                System.out.println("first repeated element is = "+ arr[i]);
                break;
            }
        }
    }
}