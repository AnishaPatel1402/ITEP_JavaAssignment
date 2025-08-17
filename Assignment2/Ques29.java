import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //floor dimensions
        System.out.println("enter length: ");
        int floorLength = sc.nextInt();
        System.out.println("enter width: ");
        int floorbreadth = sc.nextInt();
        int floorArea = floorLength * floorbreadth;

        System.out.println("enter tile side");
        int tileSide = sc.nextInt();
        int tileArea = tileSide * tileSide;
        int tilesRequired = floorArea/tileArea;
        System.out.println(tilesRequired);
    }
}
