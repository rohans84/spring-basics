package org.springbasics;

import org.springframework.context.ApplicationEvent;

/**
 * Created by rns.mac on 1/5/16.
 */
public class DrawEvent extends ApplicationEvent{
    @Override
    public String toString() {
        return "Draw event occured";
    }

    public DrawEvent(Object source) {
        super(source);
    }
}
