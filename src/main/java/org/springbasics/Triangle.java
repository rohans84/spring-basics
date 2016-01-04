package org.springbasics;

import java.util.List;

/**
 * Created by rns.mac on 1/1/16.
 */
public class Triangle implements Shape{

    private Point pointA;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    private Point pointB;
    private Point pointC;

//    private List<Point> points;
//
//    public List<Point> getPoints() {
//        return points;
//    }
//
//    public void setPoints(List<Point> points) {
//        this.points = points;
//    }

    public void draw() {
//        for (Point point: getPoints()) {
//            System.out.println("Point :" + point.toString());
//        }
        System.out.println("Drawing Triangle");
        System.out.println("Point A: " + getPointA().toString());
        System.out.println("Point B: " + getPointB().toString());
        System.out.println("Point C: " + getPointC().toString());

    }
}
