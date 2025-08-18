class Method{
    public char charAtIndex(String str, int idx){
        char characters[] = str.toCharArray();
        return characters[idx];
    }
}
class Test{
    public static void main(String args[]){
        Method m = new Method();
        String str = "Anisha";
        System.out.println(m.charAtIndex(str,4));
        // System.out.println(m.charAtIndex(str,1));
    }
}