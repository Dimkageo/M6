import java.awt.*;

class Level {
    static class Point{
        private int x;
        private int y;

        public int getX(){return x;}
        public int getY(){return y;}
        public Point(int x, int y){this.x=x; this.y=y;}
    }
    private String levelName;
    private Point[] points;

    public Level(String levelName, Point[] points) {
        this.levelName = levelName;
        this.points=points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelName+
                ", point count is "+points.length;
    }
}

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
        System.out.println(new Level("Test", points));
    }
}