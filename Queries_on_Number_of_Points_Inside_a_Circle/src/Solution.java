import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> countPoints(int[][] pointsArr, int[][] queries) {
        int pointsCount = pointsArr.length;
        Point[] points = new Point[pointsCount];

        for(int i=0;i<pointsCount;i++) {
            points[i] = new Point(pointsArr[i][0], pointsArr[i][1]);
        }

        List<Integer> output = new ArrayList<>();

        for(int[] query: queries) {
            Point center = new Point(query[0], query[1]);
            int radius = query[2];
            int count = 0;

            for(Point point: points) {
                if(distanceBetweenTwoPoints(center, point) <= radius) {
                    count++;
                }
            }

            output.add(count);
        }

        return output;
    }
    private double distanceBetweenTwoPoints(Point p1, Point p2) {
        int xDist = p1.x-p2.x;
        int yDist = p1.y-p2.y;

        return Math.sqrt(xDist*xDist + yDist*yDist);
    }
}
