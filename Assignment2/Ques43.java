import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height");
        int height = sc.nextInt();
        System.out.println("enter slant height");
        int slantHeight = sc.nextInt();
        System.out.println("enter rate");
        int rate = sc.nextInt();

        //for radius 
        //we have formula : L^2 = R^2 + H^2
        double radius = Math.sqrt((slantHeight*slantHeight) - (height*height));
        double areaOfBase = 3.14 * radius * radius;

        double totalCost = areaOfBase * rate;
        System.out.println(totalCost);
    }
}