class LevelTest {
    public static void main(String[] args) {
        //Quarke level, name is Test
        System.out.println(new Level("Test"));
    }
}
class Level{
    private String levelName;

    public String getLevelName(){
        return levelName;
    }
    public Level(String levelName){
        this.levelName=levelName;
    }

    @Override
    public String toString(){
    return "Quarke level, name is "+levelName;}
}


