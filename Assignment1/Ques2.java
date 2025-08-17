class Test{
    public static void main(String args[]){
        //area of R = l*b = 96 | b = 8 | find l = ? and peri = ?
        int area = 96;
        int b = 8;
        int l = area/b;
        int perimeter =  2*(l+b); //p  = 2(l+b)
        System.out.println("length = " +l);
        System.out.println("perimeter = "+ perimeter);
    }
}