import java.util.Scanner;
class Test{
    public static void main(String args[]){
        //print row which has max sum
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int m = sc.nextInt();
        System.out.println("enter the number of cols ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        for(int r=0; r<m; r++){
            System.out.print("enter "+ n +" elements of "+ (r+1)+" row = ");
            for(int c=0; c<n; c++){
                arr[r][c] = sc.nextInt();
            }
        }

        int maxSum = -1;
        int maxRow = -1;
        for(int r=0; r<m; r++){
            int sum = 0;
            for(int c=0; c<n; c++){ 
                sum += arr[r][c];
            }
            if(sum > maxSum){
                maxSum = sum;
                maxRow = r;
            }
        }

        System.out.print("Row has max sum is: ");
        for(int c=0; c<n; c++){
            System.out.print(arr[maxRow][c]+" ");
        }
        System.out.print("\nMax sum is: "+ maxSum);

    }
}