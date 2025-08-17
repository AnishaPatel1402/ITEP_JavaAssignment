class Test{
    public static void main(String args[]){
        // brick dimensions
        double l1 = 25;
        double b1 = 10;
        double h1 = 7.5;
        double brickVolume = l1 * b1 * h1;

        // wall dimensions
        double l2 = 20 * 100;
        double b2 = 2 * 100;
        double h2 = 0.75 * 100;
        double wallVolume = l2 * b2 * h2;

        double noOfBricks = wallVolume/brickVolume;
        double totalCost = (noOfBricks/1000) * 900;
        System.out.println(totalCost);
    }
}