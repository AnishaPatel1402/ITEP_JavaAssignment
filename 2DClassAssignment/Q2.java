import java.util.Scanner;
class Test{
    public static void main(String args[]){
        //print r to l diagonal
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
                if(r+c == (n-1))  System.out.print(arr[r][c] + " ");
            }
        }

    }
}