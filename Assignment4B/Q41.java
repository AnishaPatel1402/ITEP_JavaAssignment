//Lowest common multiple : LCM | least small no. which is divisible by both given numbers
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd number");
        int n2 = sc.nextInt();
        
        //first find smallest of them
        int i = (n1>n2) ? n1 : n2;  //LCM is always equal to or greater than the largest of the numbers.
        int lcm = 0;
        while(true){
            if(i%n1 == 0 && i%n2 == 0){
                lcm = i;
                break;
            }
            i++;
        }
        System.out.println("LCM = "+ lcm);
    }
}