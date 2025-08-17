import java.util.Scanner;
class Method{
    public char charAtIndex(String str, int idx){
        char characters[] = str.toCharArray();
        if(idx < str.length()) return characters[idx];
        else return '0';
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Method m = new Method();
        System.out.println("enter a string = ");
        String str = sc.next();
        System.out.println("enter a index :");
        int index = sc.nextInt();
        System.out.println("character at index "+ index +" is = " + m.charAtIndex(str,index));
    }
}