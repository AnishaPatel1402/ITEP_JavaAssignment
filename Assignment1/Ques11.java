class Test{
    public static void main(String args[]){
        int baseRatio = 8;
        int heightRatio = 5;
        int area = 320;
        // area = 1/2 * base X * height X
        // x = sqrt(2*area / base * height)
        double  ratio = Math.sqrt((2*area)/(baseRatio*heightRatio));
        double actualBase = baseRatio * ratio;
        double actualHeight = heightRatio * ratio;
        System.out.println(actualBase +" " + actualHeight);
    }
}