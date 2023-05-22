public class Solution {
    public boolean isBoomerang(int[][] coordinates) {
        if(coordinates == null || coordinates.length < 3) return false;

        int n = coordinates.length;
        Point points[] = new Point[n];

        for(int i=0;i<n;i++) {
            points[i] = new Point(coordinates[i][0], coordinates[i][1]);
        }

        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    if(isThreePointBoomerang(points[i], points[j], points[k])) return true;
                }
            }
        }

        return false;
    }
    private boolean areTwoPointsSame(Point p1, Point p2) {
        return (p1.x == p2.x && p1.y == p2.y);
    }
    private double getSlope(Point p1, Point p2) {
        int num = p1.y-p2.y;
        int den = p1.x-p2.x;

        if(den == 0) num = Math.abs(num);

        return (double) num / (double) den;
    }
    private boolean isThreePointBoomerang(Point p1, Point p2, Point p3) {
        if(areTwoPointsSame(p1, p2) || areTwoPointsSame(p2, p3) || areTwoPointsSame(p3, p1)) return false;

        double slope1 = getSlope(p1, p2);
        double slope2 = getSlope(p2, p3);
        double slope3 = getSlope(p3, p1);

        if(slope1 == slope2 && slope2 == slope3) return false;

        return true;
    }
}
