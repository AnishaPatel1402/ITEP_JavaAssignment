import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // brick dimensions
        System.out.println("enter length: ");
        double l1 = sc.nextDouble();
        System.out.println("enter breadth: ");
        double b1 = sc.nextDouble();
        System.out.println("enter height: ");
        double h1 = sc.nextDouble();
        double brickVolume = l1 * b1 * h1;

        // wall dimensions
        System.out.println("enter length: ");
        double l2 = sc.nextDouble();
        System.out.println("enter breadth: ");
        double b2 = sc.nextDouble();
        System.out.println("enter height: ");
        double h2 = sc.nextDouble();
        l2 = l2 * 100;
        b2 = b2 * 100;
        h2 = h2 * 100;
        double wallVolume = l2 * b2 * h2;

        double noOfBricks = wallVolume/brickVolume;
        double totalCost = (noOfBricks/1000) * 900;
        System.out.println(totalCost);
    }
}
