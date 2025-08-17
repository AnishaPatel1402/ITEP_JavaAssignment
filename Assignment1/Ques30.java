class Test{
    public static void main(String args[]){
        int tileLength = 5;
        int tileBreadth = 8;
        int tileArea = tileLength * tileBreadth;

        int bedroomLen = 200;
        int bedroomWidth = 400;
        int area = bedroomLen*bedroomWidth;

        int requiredTiles = area/tileArea;
        System.out.println(requiredTiles);

    }
}