import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //tiles info
        System.out.println("enter length of tile: ");
        int l1 = sc.nextInt();
        System.out.println("enter breadth of tile: ");
        int b1 = sc.nextInt();
        int areaOfTile = l1 * b1;
         
        //region info
        System.out.println("enter length of region: ");
        int l2 = sc.nextInt();
        System.out.println("enter breadth of region: ");
        int b2 = sc.nextInt();
        int areaOfRegion = l2 * b2;

        int totalTiles = areaOfRegion/areaOfTile;
        System.out.println("total tiles: "+ totalTiles);
    }
}