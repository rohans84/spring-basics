package org.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

/**
 * Created by rns.mac on 1/1/16.
 */
public class Point {

    private int x;

    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Autowired
    private MessageSource messageSource;

    @Override
    public String toString() {
        return messageSource.getMessage("drawing.point",
                new Object[] { getX(), getY()},
                "Default point message",
                null
                );
    }
}
