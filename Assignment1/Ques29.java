class Test{
    public static void main(String args[]){
        //floor dimensions
        int floorLength = 800;
        int floorbreadth = 900;
        int floorArea = floorLength * floorbreadth;

        int tileSide = 10;
        int tileArea = tileSide * tileSide;
        int tilesRequired = floorArea/tileArea;
        System.out.println(tilesRequired);
    }
}