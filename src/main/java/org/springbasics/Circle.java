package org.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by rns.mac on 1/3/16.
 */
@Component
public class Circle implements Shape {


    private Point center;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Autowired
    private MessageSource messageSource;

    public Point getCenter() {
        return center;
    }

    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println(this.getMessageSource().getMessage("drawing.circle",
                null,
                "Default drawing message",
                null));
        System.out.println(this.getMessageSource().getMessage("drawing.circle.point",
                new Object[] {getCenter()},
                "Default center message",
                null));
        System.out.println("Greeting inside draw: " +
                this.getMessageSource().getMessage("greeting", null, "Default message", null));
    }
}
