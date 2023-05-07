class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}
class CircleIntersector{
    private int x1;
    private int y1;
    private int r1;
    private int x2;
    private int y2;
    private int r2;
    private String intersects;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2){
        this.x1=x1;
        this.y1=y1;
        this.r1=r1;
        this.x2=x2;
        this.y2=y2;
        this.r2=r2;

        int dx=x2-x1;
        int dy=y2-y1;

        double distance= Math.sqrt(dx*dx + dy*dy);
//        System.out.println("distance = " + distance);
        int distance2 = r1+r2;
//        System.out.println("distance2 = " + distance2);
        if (distance2>=distance){
            this.intersects="intersects";
        }else {
            this.intersects="not intersects";
        }
    }
    @Override
    public String toString(){

        return intersects;
    }
}