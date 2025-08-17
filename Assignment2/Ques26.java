import java.util.Scanner;
class Test{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter path length: ");
    float pathLen = sc.nextFloat();
    System.out.println("enter path breadth: ");
    float pathBre = sc.nextFloat();
    
    System.out.println("enter brick length: ");
    float brickLen = sc.nextFloat()/100;
    System.out.println("enter brick breadth: ");
    float brickBre = sc.nextFloat()/100;

    float pathArea = pathLen*pathBre;
    float brickArea = brickLen*brickBre;

    int noOfbricks = (int) (pathArea/brickArea);
    System.out.println("Num of bricks: "+ noOfbricks);

}
}