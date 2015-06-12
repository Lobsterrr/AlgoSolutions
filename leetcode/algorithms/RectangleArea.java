/*
 * Find the total area covered by two 
 * rectilinear rectangles in a 2D plane.

 * Each rectangle is defined by its 
 * bottom left corner and top right 
 * corner as shown in the figure.
 * 
 * https://leetcode.com/static/images
 * /problemset/rectangle_area.png
 *
 * Assume that the total area is never 
 * beyond the maximum possible value of 
 * int.
 */
public class RectangleArea {

    public int computeArea(int A, int B, int C, int D, 
            int E, int F, int G, int H) {
        return (C - A) * (D - B) + (G - E) * (H - F) - computeOverlapArea(A, B, C, D, E, F, G, H);
    }

    public int computeOverlapArea(int A, int B, int C, int D, 
            int E, int F, int G, int H) {
        if (A <= E && E <= C) {
            if (B <= F && F <= D) {
                int a = Math.min(C, G) - E;
                int b = Math.min(D, H) - F;
                return a * b;
            }
            if (B <= H && H <= D) {
                int a = Math.min(C, G) - E;
                int b = H - Math.max(B, F);
                return a * b;
            }
        }
        if (A <= G && G <= C) {
            if (B <= H && H <= D) {
                int a = G - Math.max(A, E);
                int b = H - Math.max(B, F);
                return a * b;
            }
            if (B <= F && F <= D) {
                int a = G - Math.max(A, E);
                int b = Math.min(D, H) - F;
                return a * b;
            }
        }
        return 0;
    }

}
