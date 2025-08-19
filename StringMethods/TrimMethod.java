class Strings{
    public String trimString(String str){
        char[] charArr = str.toCharArray();
        for(int i=0; i<charArr.length-1; i++){
            if(charArr[i]==' ' && charArr[i+1]==' '){
                charArr[i] = '\0';
            }
        }
        String s = new String(charArr);
            charArr = s.toCharArray();
            if(charArr[0]==' ') charArr[0] = '\0';
            if(charArr[charArr.length-1] == ' ') charArr[charArr.length-1] = '\0';
        return new String(charArr);
    }

    public String trimString2(String str){
        char charArr[] = str.toCharArray();
        int i = 0, j = charArr.length-1; 
        while(true){
           if(charArr[i]!=' ' && charArr[j]!= ' ')
             break;
           if(charArr[i]==' ')
             charArr[i++] = '\0';

           if(charArr[j]== ' ')
             charArr[j--] = '\0';
        }
        return new String(charArr);
    }
}
class Test{
    public static void main(String args[]){
        Strings s = new Strings();
        String result = s.trimString2("    java is   fun      ");
        System.out.println("|"+ result +"|");

    }
}