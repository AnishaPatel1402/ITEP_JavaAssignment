import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of carpet: ");
        int length = sc.nextInt();
        System.out.println("enter breadth of carpet: ");
        int breadth = sc.nextInt();
        int perimeter = 2*(length+breadth);
        //10 rounds of its perimenter
        int totalRounds = 10 * perimeter;
        System.out.println(totalRounds);
    }
}