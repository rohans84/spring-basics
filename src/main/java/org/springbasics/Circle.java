package org.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by rns.mac on 1/3/16.
 */
public class Circle implements Shape {


    private Point center;

    public Point getCenter() {
        return center;
    }

    //@Required
    @Autowired
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Circle: Point is " + getCenter());
    }
}
