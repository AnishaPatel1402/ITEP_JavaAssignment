import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter tile length");
        int tileLength = sc.nextInt();
        System.out.println("enter tile breadth");
        int tileBreadth = sc.nextInt();
        int tileArea = tileLength * tileBreadth;

        System.out.println("enter bedroom length");
        int bedroomLen = sc.nextInt();
        System.out.println("enter bedroom breadth");
        int bedroomWidth = sc.nextInt();;
        int area = bedroomLen*bedroomWidth;

        int requiredTiles = area/tileArea;
        System.out.println(requiredTiles);

    }
}
