import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //carpet needed for dining room
        System.out.println("enter length of carpet: ");
        int l = sc.nextInt();
        System.out.println("enter breadth of carpet: ");
        int b = sc.nextInt();
        int area = l*b;
        System.out.println(area);
    }
}