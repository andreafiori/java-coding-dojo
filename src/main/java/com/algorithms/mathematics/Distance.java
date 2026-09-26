package com.algorithms.mathematics;

/**
 * https://en.wikipedia.org/wiki/Distance
 */
public class Distance {

    private Distance() { }

    /**
     * Chess distance
     *
     * @param point1 as array
     * @param point2 as array
     * @return distance between 2 points
     */
    public static long chebyshevDistance(long[] point1, long[] point2) {
        long x1 = point1[0];
        long y1 = point1[1];
        long x2 = point2[0];
        long y2 = point2[1];

        return Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));
    }

    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return squared distance between 2 points
     */
    public static double squaredDistance(double x1, double y1, double x2, double y2) {
        double x = x1 - x2;
        double y = y1 - y2;

        return (x * x) + (y * y);
    }

    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        double x = Math.pow((x1 - x2), 2);
        double y = Math.pow((y1 - y2), 2);

        return Math.sqrt(x + y);
    }
}
