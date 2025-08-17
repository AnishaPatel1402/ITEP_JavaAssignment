import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        //0 8 64 216-------
        // int even = 0;
        // int i=1; 
        // while(i<=n){
        //     System.out.print(even*even*even+" ");
        //     even = even + 2;
        //     i++;
        // }

        for(int i=0; n!=0; n--){
            System.out.print(i*i*i+"\t");
            i+=2;
        }
    }
}