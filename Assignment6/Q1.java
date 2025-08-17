import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int peakIndex = 0;   //let first element is peak
        for(int i=1; i<n-1; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                peakIndex = i;
                break;
            }
        }
        //check for last element 
        if(peakIndex == 0) {
            if(arr[n-2] < arr[n-1]) peakIndex = n-1;
        }
        System.out.println("Peak Index is = "+ peakIndex +" and peak element is = "+ arr[peakIndex]);    

        System.out.println("Peak Index is = "+ peakIndex +" and peak element is = "+ arr[peakIndex]);
        
    }
}