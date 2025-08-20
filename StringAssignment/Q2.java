// Write a java program to find all possible palindrom of given String.
// 	Sample Input: “aaabbbacccababacccaabb”
import java.util.Scanner;
import java.util.LinkedHashSet;
class Method{
    public boolean isPallindrome(String str){
        int i=0, j=str.length()-1; 
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public LinkedHashSet<String> possiblePallindrom(String str){
        LinkedHashSet<String> ans = new LinkedHashSet<String>();
        for(int i=0; i<str.length()-1; i++){
            for(int j=i; j<str.length(); j++){
                String s = "";
                for(int k=i; k<=j; k++)  s += str.charAt(k);
                // String s = str.substring(i,j+1);  //we can also use this
                if(isPallindrome(s)) ans.add(s);
            }

        }
        return ans;
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string  = ");
        String str = sc.next();
        Method m = new Method();
        LinkedHashSet<String> ans = m.possiblePallindrom(str);
        System.out.println(ans);
    }
}