import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //pond dimensions
        System.out.println("enter length: ");
        int len = sc.nextInt();
        System.out.println("enter width: ");
        int wide = sc.nextInt();
        System.out.println("enter deep: ");
        int deep = sc.nextInt();
        int capcity = len*wide*deep;  //volume = capacity
        System.out.println(capcity);
    }
}
