import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1 ");
        int n1 = sc.nextInt();
        System.out.println("enter the number 2");
        int n2 = sc.nextInt();

        System.out.println("Palindrome number between "+ n1 +" and "+n2);
        for(int i=n1; i<=n2; i++){
            int num = i;
            //finding reverse of num
            int rev = 0;
            while(num > 0){
                rev = rev*10 + (num%10);
                num /= 10;
            }
            if(i==rev){
                //palindrome
                System.out.print(i+" ");
            }
        }
    }
}