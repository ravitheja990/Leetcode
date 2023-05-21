public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        Point p1 = new Point(rec1[0], rec1[1]);
        Point p2 = new Point(rec1[2], rec1[3]);

        Rectangle rect1 = new Rectangle(p1, p2);

        p1 = new Point(rec2[0], rec2[1]);
        p2 = new Point(rec2[2], rec2[3]);

        Rectangle rect2 = new Rectangle(p1, p2);

        return (rect1.point1.x < rect2.point2.x) && (rect2.point1.x < rect1.point2.x) &&
               (rect1.point1.y < rect2.point2.y) && (rect2.point1.y < rect1.point2.y);
    }
}