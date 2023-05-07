import java.util.Arrays;

class TargetFinderTest {    //Сравниваем минимальное значение расстояния
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };
//        System.out.println(Arrays.toString(targets[2]));

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
class TargetFinder{

    public int[] findTarget(int[] aiCoords, int[][] targets){
        double distance=Integer.MAX_VALUE;//Integer.MAX_VALUE представляет максимальное числовое значение,
        int [] result={0,0};
        for (int i=0; i<targets.length;i++){
            int dx=targets[i][1]-aiCoords[1];
            int dy=targets[i][0]-aiCoords[0];
            double distance2= Math.sqrt(dx*dx + dy*dy);

            if (distance>distance2){
                distance=distance2;
                result[0]=targets[i][0];
                result[1]=targets[i][1];
            }
        }
        return result;
    }
}