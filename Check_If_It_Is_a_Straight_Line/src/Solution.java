public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        Point points[] = new Point[n];

        for(int i=0;i<n;i++) {
            points[i] = new Point(coordinates[i][0], coordinates[i][1]);
        }

        double slope = getSlope(points[1], points[0]);

        for(int i=2;i<n;i++) {
            double eachSlope = getSlope(points[i], points[i-1]);
            if(eachSlope != slope) return false;
        }

        return true;
    }

    private double getSlope(Point p1, Point p2) {
        int num = p1.y-p2.y;
        int den = p1.x-p2.x;

        if(den == 0) num = Math.abs(num);

        return (double) num / (double) den;
    }
}
