import java.util.Scanner;
class Test{
    public static void main(String args[]){
        // 9. Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char letter = sc.next().charAt(0);
        if(letter >= 'a' && letter <= 'z') {
            System.out.println("Lowercase");
        }
        else{
            if(letter >= 'A' && letter <= 'Z'){
                System.out.println("Uppercase");
            }
            else{
                System.out.println("not a Alphabet");
            }
        }
    }
}