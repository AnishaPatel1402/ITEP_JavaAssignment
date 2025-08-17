import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        int length = sc.nextInt();
        System.out.println("enter width: ");
        int width = sc.nextInt();
        System.out.println("enter rate: ");
        int rate = sc.nextInt();
        int area = length * width;
        int totalCost = area * rate;
        System.out.println(totalCost);
    }
}
