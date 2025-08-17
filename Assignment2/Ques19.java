import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //cube 
        System.out.println("enter the side of cube: ");
        int side = sc.nextInt();
        int volumeOfCube = side * side * side;

        //cuboid 
        System.out.println("enter length of cuboid: ");
        int l = sc.nextInt();
        System.out.println("enter breadth of cuboiod: ");
        int b = sc.nextInt();
        System.out.println("enter height of cuboiod: ");
        int h = sc.nextInt();

        int volumeOfCuboid = l*b*h;

        System.out.println(volumeOfCube);
        System.out.println(volumeOfCuboid);
    }
}