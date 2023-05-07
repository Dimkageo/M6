class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}
class RectangleArea{
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public RectangleArea(int[] coords){
        this.startX=coords[0];
        this.startY=coords[1];
        this.endX=coords[2];
        this.endY=coords[3];
    }
    public int getArea(){
        int dx=endX-startX;
        int dy=endY-startY;
        int square = dx*dy;

        return Math.abs(square);
    }
}