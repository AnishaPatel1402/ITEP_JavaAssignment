class Method{
    public int compare(String s1, String s2){
        
    }
}
class Test{
    public static void main(String args[]){
        Method m = new Method();
        String s1 = "Anishat";
        String s2 = "Anisha";
        int result = m.compare(s1, s2);
        if(result==0) System.out.println("Both are equal");
        else if(result > 0) System.out.println(s1 +" is greater");
        else System.out.println(s2 +" is greater");

        // System.out.println(s1.compareTo(s2));
    }
}