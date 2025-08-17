class Test{
    public static void main(String args[]){
        int perimeter = 230;  // p = 2(a+b) => b = p/2-a
        int length = 70;
        int breadth = perimeter/2 - length;
        int area = length * breadth;
        System.out.println("breadth = "+ breadth);
        System.out.println("area = "+ area);
    }
}