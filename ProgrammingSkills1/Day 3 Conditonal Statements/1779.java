class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = -1;
        int diff = -1, index = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                diff = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (min == -1 || diff < min) {
                    min = diff;
                    index = i;
                }
            }

        }
        return index;
    }
}