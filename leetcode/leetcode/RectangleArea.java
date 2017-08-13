/*
Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as
shown in the figure.

Rectangle Area
Assume that the total area is never beyond the maximum possible value of int.
 */
public class RectangleArea {

    public int computeArea(int A, int B, int C, int D,
            int E, int F, int G, int H) {
        if (A >= G || C <= E || B >= H || D <= F) {
            return 0;
        }
        int areaAbcd = (C - A) * (D - B);
        int areaEfgh = (G - E) * (H - F);
        int areaOverlap = 0;
        if (A <= E) {
            if (B >= F) {
                areaOverlap = (Math.min(C, G) - E) * (H - B);
            } else {

            }
        }


        int areaOverlap = Math.abs((C - E) * (H - B));
        int areaOverlap = Math.abs((C - E) * (D - F));
        return areaAbcd + areaEfgh - areaOverlap;
    }

}
