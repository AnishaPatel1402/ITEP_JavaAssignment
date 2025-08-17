import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of bricks: ");
        int noOfbricks = sc.nextInt();
        System.out.println("enter length of bricks: ");
        int length = sc.nextInt();;
        System.out.println("enter breadth of bricks: ");
        int breadth = sc.nextInt();;
        int areaOfGarden = length*breadth*noOfbricks;
        System.out.println(areaOfGarden);
    }
}