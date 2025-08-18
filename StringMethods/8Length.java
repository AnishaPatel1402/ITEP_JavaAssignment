class Test{
    public static void main(String args[]){
        String str = "Anishapatel";
        char ch[] = str.toCharArray();
        int len = 0;
        for(char c : ch){
            len++;
        }
        System.out.println("lenght of string = "+ len);
    }
}