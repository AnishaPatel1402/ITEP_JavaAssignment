
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
        //find max 
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        
        //put max+1 on the place of dublicates
        for(int i=0; i<arr.length; i++){
           for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[j] = max+1;
                }
           }
        }

        //now push dublicate elements to end
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max+1){
                for(int j=i+1; j<arr.length; j++){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
         
        
    }
}