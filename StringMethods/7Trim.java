class Test{
    public static void main(String args[]){
        String str = "    Jay shree ram   ";
        String newStr = "";
        int n = str.length();
        for(int i=0; i<n-1; i++){
            if((str.charAt(i)==' ' && str.charAt(i+1)==' ')|| (str.charAt(i)==' ' && str.charAt(i+1)!=' ')) continue;
            else newStr += str.charAt(i);
        }

        // int firstIdx = 0, lastIdx = str.length()-1;
        // while(str.charAt(firstIdx) == ' ') firstIdx++;
        // while(str.charAt(lastIdx) == ' ') lastIdx--;
        // for(int i=firstIdx; i<=lastIdx; i++){
        //     newStr += str.charAt(i);
        // }
        
        System.out.println("|" + newStr +"|");
        // System.out.println(str.trim());

    }
}