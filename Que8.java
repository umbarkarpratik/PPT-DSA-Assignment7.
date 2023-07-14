package PrePlacementTraning.AssingnmentString;

public class Que8 {
    public static boolean checkStraightLine(int[][] coordinates) {
        int[] firstPoint = coordinates[0];
        int[] secondPoint = coordinates[1];

        int deltaX = secondPoint[0] - firstPoint[0];
        int deltaY = secondPoint[1] - firstPoint[1];

        for (int i = 2; i < coordinates.length; i++) {
            int[] point = coordinates[i];
            int currentDeltaX = point[0] - firstPoint[0];
            int currentDeltaY = point[1] - firstPoint[1];

            if (deltaX * currentDeltaY != deltaY * currentDeltaX) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {
            {1, 2},
            {2, 3},
            {3, 4},
            {4, 5},
            {5, 6},
            {6, 7}
        };
        System.out.println(checkStraightLine(coordinates));
    }
}

