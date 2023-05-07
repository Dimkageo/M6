class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}
class Distance{
    private int startX;
    private int startY;
    private int endX;
    private int endY;
//    private int c;

    public Distance(int startX, int startY, int endX, int endY){
        this.startX=startX;
        this.startY=startY;
        this.endX=endX;
        this.endY=endY;

    }
    public int getDistance(){
        int dx=endX-startX;
        int dy=endY-startY;
        double distance = Math.sqrt(dx*dx + dy*dy);

        return (int) Math.round(distance);
    }
}