class Test{
    public static void main(String args[]){
        //brick dimensions
        int l1 = 15;
        int b1 = 8;
        int h1 = 5;
        int brickVolume = l1*b1*h1;

        //wall dimensions
        int l2 = 15*100;
        int b2 = 10*100;
        int h2 = 8*100;
        int wallVolume = l2*b2*h2;

        int totalBricks = wallVolume/brickVolume;
        System.out.println(totalBricks);

    }
}