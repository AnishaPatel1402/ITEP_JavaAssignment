class Method{
    public int compare(String s1, String s2){
        if(s1.length() != s2.length()){
            if(s1.length() > s2.length()) return 1;
            else return -1;
        }
        else{
            int i=0, j=0;
            while(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }
            System.out.println("Character "+ s1.charAt(i)+" "+ s2.charAt(j));
        return s1.charAt(i)- s2.charAt(j);
        }
    }
}
class Test{
    public static void main(String args[]){
        Method m = new Method();
        String s1 = "Anisha";
        String s2 = "Anitha";
        int result = m.compare(s1, s2);
        if(result==0) System.out.println("Both are equal "+ result);
        else if(result > 0) System.out.println(s1 +" is greater " + result);
        else System.out.println(s2 +" is greater " + result);

        // System.out.println(s1.compareTo(s2));
    }
}