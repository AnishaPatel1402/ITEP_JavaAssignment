import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a alphabet");
        char a = sc.next().charAt(0);
        switch(a){
            case 'a': 
            case 'e':
            case 'i':
            case 'o':
            case 'u': 
            case 'A': 
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println("Vowel");
            break;
            default: System.out.println("Consonant");
        }
        
    }
}