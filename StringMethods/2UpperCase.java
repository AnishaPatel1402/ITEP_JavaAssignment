class Test{
    public static void main(String args[]){
        String str = "Anishapatel";
        //lowercase to uppercase
        String strUpper = "";
        for(int i=0; i<str.length(); i++){
           if(str.charAt(i) >= 97 && str.charAt(i) <= 122)  strUpper += (char)(str.charAt(i) - 32);
           else strUpper += str.charAt(i);
           
        }
        System.out.println(strUpper);
    }
}