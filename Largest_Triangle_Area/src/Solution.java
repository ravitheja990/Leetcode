public class Solution {
    public double largestTriangleArea(int[][] pointsMatrix) {
        int n = pointsMatrix.length;
        Point points[] = new Point[n];
        double largestArea = 0.0;

        for(int i=0;i<n;i++) {
            points[i] = new Point(pointsMatrix[i][0], pointsMatrix[i][1]);
        }

        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    largestArea = Math.max(largestArea, areaOfTriangle(points[i], points[j], points[k]));
                }
            }
        }

        return largestArea;
    }

    private double areaOfTriangle(Point p1, Point p2, Point p3) {
        double area = 0.0;

        int t1 = p1.x * (p2.y-p3.y);
        int t2 = p2.x * (p3.y-p1.y);
        int t3 = p3.x * (p1.y-p2.y);

        area = Math.abs( (double) (t1+t2+t3) / (double) 2 );

        return area;
    }
}
