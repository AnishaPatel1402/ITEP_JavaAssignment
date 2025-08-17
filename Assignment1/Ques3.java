class Test{
    public static void main(String args[]){
        //area of one tile
        int l1 = 13;
        int b1 = 7;
        int areaOfTile = l1 * b1;

        //area of region
        int l2 = 520;
        int b2 = 140;
        int areaOfRegion = l2 * b2;

        int totalTiles = areaOfRegion/areaOfTile;

        System.out.println("Total tiles required = " + totalTiles);
    }
}