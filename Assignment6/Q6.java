//Sort the array of 0s , 1s and 2s.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements of 0,1,2");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //method 1
        //count 0 1 2
        // int zero = 0, one = 0, two = 0;
        // for(int i=0; i<n; i++){
        //     if(arr[i]==0) zero++;
        //     else if(arr[i]==1) one++;
        //     else two++;
        // }
        // int idx = 0;
        // //fill zero
        // while(zero != 0){
        //     arr[idx] = 0;
        //     idx++;
        //     zero--;
        // }
        // //fill one 
        // while(one != 0){
        //     arr[idx] = 1;
        //     idx++;
        //     one--;
        // }
        // //fill two
        // while(two != 0){
        //     arr[idx] = 2;
        //     idx++;
        //     two--;
        // }
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i]+ " ");
        // }


        //method 2
        int low = 0, mid = 0, high = n-1;
        while(mid <= high){
            if(arr[mid]==0) {
                //swap mid and low
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } 
            else if(arr[mid]==1) mid++;
            else if(arr[mid]==2){
                //swap mid and high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int i=0; i<n; i++){
          System.out.print(arr[i]+ " ");
        }
    }
}
