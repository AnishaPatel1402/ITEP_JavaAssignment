class Test{
    public static void main(String args[]){
        int height = 20; //altitude
        double area = 0.8; //meter square
        //convert area to cm square
        area = area * 100 * 100;

        double base = (2*area)/height;
        System.out.println("base = "+ base);
    }
}