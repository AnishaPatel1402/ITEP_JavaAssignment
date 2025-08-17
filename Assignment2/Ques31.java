import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter perimeter");
        int perimeter = sc.nextInt();
        int side = perimeter/4;
        int areaSquare = side*side;
        System.out.println(areaSquare);
    }
}