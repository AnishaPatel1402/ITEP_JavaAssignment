class Test{
    public static void main(String args[]){
        int height = 4;
        int slantHeight = 5;
        int rate = 10;

        //for radius 
        //we have formula : L^2 = R^2 + H^2
        double radius = Math.sqrt((slantHeight*slantHeight) - (height*height));
        double areaOfBase = 3.14 * radius * radius;

        double totalCost = areaOfBase * rate;
        System.out.println(totalCost);
    }
}