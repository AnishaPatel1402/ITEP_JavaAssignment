import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int gardenSide = sc.nextInt();
        int gradenArea = gardenSide*gardenSide;

        int poolSide = sc.nextInt();
        int poolArea = poolSide * poolSide;

        int actualGardenArea = gradenArea - poolArea;
        System.out.println(actualGardenArea);
    }
}