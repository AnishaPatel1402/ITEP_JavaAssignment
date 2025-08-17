import java.util.Scanner;
class Test{
    public static void main(String args[]){
        //printing upper triangle
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

        for(int r=0; r<m; r++){
            for(int c=0; c<n; c++){ 
                if(r<=(m/2) && c>=(n/2) && (r!=c))  System.out.print(arr[r][c] + " ");
            }
        }

    }
}