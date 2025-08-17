class Test{
    public static void main(String args[]){
        int costOfFencing = 1600;
        int rate = 25;
        int length = 20;

        //costOfFencing = rate * perimeter
        int perimeter = costOfFencing/rate;

        //peri = 2*(l+b);
        int breadth = perimeter/2 - length;

        int area = length * breadth;

        System.out.println("perimeter = "+ perimeter);
        System.out.println("breadth = "+ breadth);
        System.out.println("area = "+ area);
    }
}