import java.util.Scanner;
class Test{
    public static void main(String args[]){
        //sum of even and odd element
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

        int even = 0;
        int odd = 0;
        for(int r=0; r<m; r++){
            for(int c=0; c<n; c++){ 
                if(arr[r][c]%2==0) even += arr[r][c];
                else odd += arr[r][c];
            }
        }

        System.out.println("addition of odd element = "+ odd);
        System.out.println("addtion of even e;lement = "+ even);

    }
}