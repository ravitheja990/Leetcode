import java.util.*;
public class Solution {

    public int[][] kClosest(int[][] pointsArr, int k) {
        int n = pointsArr.length;
        Point[] points = new Point[n];

        for(int i=0;i<n;i++) {
            points[i] = new Point(pointsArr[i][0], pointsArr[i][1]);
        }

        Arrays.sort(points, (a,b)->distanceFromOrigin(a) - distanceFromOrigin(b));

        int[][] output = new int[k][2];

        for(int i=0;i<k;i++) {
            output[i][0] = points[i].x;
            output[i][1] = points[i].y;
        }

        return output;
    }



    private int distanceFromOrigin(Point p) {
        return p.x*p.x + p.y+p.y;
    }
}
