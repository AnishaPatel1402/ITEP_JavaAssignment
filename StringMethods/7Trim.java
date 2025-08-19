class Test{
    public static void main(String args[]){
        String str = "    Jay   shree   ram   ";
        String newStr = "";
        int n = str.length();

        int firstIdx = 0, lastIdx = str.length()-1;
        while(str.charAt(firstIdx) == ' ') firstIdx++;
        while(str.charAt(lastIdx) == ' ') lastIdx--;
        for(int i=firstIdx; i<=lastIdx; i++){
            newStr += str.charAt(i);
        }
        
        System.out.println("|" + newStr +"|");
        // System.out.println(str.trim());

    }
}