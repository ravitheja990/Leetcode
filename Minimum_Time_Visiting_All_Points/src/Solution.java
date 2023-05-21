public class Solution {
    public int minTimeToVisitAllPoints(int[][] pointsArr) {
        int n = pointsArr.length;
        Point points[] = new Point[n];
        int time = 0;

        for(int i=0;i<n;i++) {
            points[i] = new Point(pointsArr[i][0], pointsArr[i][1]);
        }

        Point currPoint = points[0];

        for(int i=1;i<n;i++) {
            Point nextPoint = points[i];
            time += Math.max( Math.abs(nextPoint.y - currPoint.y), Math.abs(nextPoint.x - currPoint.x) );
            currPoint = nextPoint;
        }

        return time;
    }
}
