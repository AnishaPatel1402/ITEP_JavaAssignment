import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //dimensions of rectangular garden 
        System.out.println("enter length: ");
        int length = sc.nextInt();
        System.out.println("enter width: ");
        int breadth = sc.nextInt();

        System.out.println("enter path1 length: ");
        int pathway1Len = sc.nextInt();
        System.out.println("enter path2 length: ");
        int pathway2Len = sc.nextInt();
        int extraPart = pathway1Len*pathway2Len;
        int usableArea = (length*breadth) - (length*pathway1Len + breadth*pathway2Len - (extraPart));
        System.out.println(usableArea);

    }
}