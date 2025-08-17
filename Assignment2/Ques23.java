import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       //cube box dimensions
        System.out.println("enter the side of cube: ");
       int side = sc.nextInt();
       int cubeVolume = side*side*side;

       //carton dimentsions
       System.out.println("enter length: ");
        int l = sc.nextInt();
        System.out.println("enter width: ");
        int b = sc.nextInt();
        System.out.println("enter height: ");
        int h = sc.nextInt();
       int cartonVolume = l*b*h;

       int noOfBoxes = cartonVolume/cubeVolume;
       System.out.println("no of boxes: " +noOfBoxes);
    }
}