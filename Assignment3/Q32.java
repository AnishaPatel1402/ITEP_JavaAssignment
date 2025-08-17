import java.util.Scanner;
class Test{
    //20. W.A.P to check whether a character is an alphabet or not.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character");
        char character = sc.next().charAt(0);

        if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')){
            System.out.println("It an alphabet");
        }
        else{
           System.out.println("It not an alphabet");
        }
        
        
        
    }
}