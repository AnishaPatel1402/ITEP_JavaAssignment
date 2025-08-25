//Find the kth largest and kth smallest element in array.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("enter the value of k: ");
        int k = sc.nextInt();

        //kth smallest element
        // for(int i=0; i<k; i++){
        //     int minIndex = i;
        //     for(int j=i+1; j<n; j++){
        //         if(arr[minIndex] > arr[j]) minIndex = j;
        //     }
        //     //now swap minIndex with ith element
        //     int temp = arr[i];
        //     arr[i] = arr[minIndex];
        //     arr[minIndex] = temp;
        // }
        
        // int kthSmall = arr[k-1];
        // System.out.println("Kth small element = "+ kthSmall);


        // //kth largest element
        // for(int i=0; i<k; i++){
        //     int maxIndex = i;
        //     for(int j=i+1; j<n; j++){
        //         if(arr[maxIndex] < arr[j]) maxIndex = j;
        //     }
        //     //now swap maxIndex with ith element
        //     int temp = arr[i];
        //     arr[i] = arr[maxIndex];
        //     arr[maxIndex] = temp;
        // }
        // int kthLarge = arr[k-1];
        // System.out.println("Kth largest element = "+ kthLarge);


        //method 2 : sort array the entire array
        for(int i=0; i<n; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[minIndex] > arr[j]) minIndex = j;
            }
            //now swap minIndex with ith element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        //now remove dublicates from array
        int unique = 1;
        for(int i=1; i<n; i++){
            if(arr[i-1]!=arr[i]){
                arr[unique] = arr[i];
                unique++;
            }
        }

        System.out.print("unique element are : ");
        for(int i=0; i<unique; i++){
            System.out.print(arr[i]+" ");
        }

    //    int kthSmall = arr[k-1];
    //    int kthLarge = arr[n-k];
    //    System.out.println("Kth small element = "+ kthSmall);
    //    System.out.println("Kth largest element = "+ kthLarge);
    }
}