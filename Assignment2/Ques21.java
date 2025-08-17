import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //brick dimensions
        System.out.println("enter length of brick: ");
        int l1 = sc.nextInt();
        System.out.println("enter breadth of brick: ");
        int b1 = sc.nextInt();
        System.out.println("enter height of bric: ");
        int h1 = sc.nextInt();

        int brickVolume = l1*b1*h1;

        //wall dimensions
        System.out.println("enter length of wall: ");
        int l2 = sc.nextInt();
        System.out.println("enter breadth of wall: ");
        int b2 = sc.nextInt();
        System.out.println("enter height of wall: ");
        int h2 = sc.nextInt();

        l2 = l2*100;
        b2 = b2*100;
        h2 = h2*100;
        int wallVolume = l2*b2*h2;

        int totalBricks = wallVolume/brickVolume;
        System.out.println(totalBricks);

    }
}