import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number= ");
        int n = sc.nextInt();
        //1234 => 4231
        int i = n;
        int count = 0;
        while(i!=0){
            count++;
            i/=10;
        }

        int ans;
        //first digit of ans
        int lastD = n%10;
        ans = (int) (lastD * Math.pow(10,count-1));

        //last digit of ans
        i = n;
        int digitCount = 1;  //for middle digit
        while(i > 10){
            i/=10;
        }
        ans += i;
        System.out.println(ans);

    }
}