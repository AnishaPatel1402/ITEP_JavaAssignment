// 20)Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
class Tile{
    private int edge;
    public Tile(int edge){
        this.edge = edge;
    }
    public int getEdge(){
        return this.edge;
    }
    public int tileArea(){
        return this.edge*this.edge;
    }
}
class Floor{
    private int length;
    private int width;
    public Floor(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int areaOfFloor(){
        return this.length * this.width;
    }
    public void totalTilesNeed(Tile t){
        int tilesNeeded = areaOfFloor()/t.tileArea();
        System.out.println("Tiles needs to cover the floor of length "+ length+" and width "+ width +" is = "+ tilesNeeded);
    }
}

class Test{
    public static void main(String args[]){
        Tile tile = new Tile(4);
        Floor floor = new Floor(20,30);
        floor.totalTilesNeed(tile);
    }
}