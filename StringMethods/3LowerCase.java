class Test{
    public static void main(String args[]){
        //uppercase to lowercase
       String str = "AnISHaPatel";
       String strLower = "";
       for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) strLower += (char)((str.charAt(i)) + 32);
            else strLower += str.charAt(i);
       }
       System.out.println(strLower);
    }
}