/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.shapes;

import static java.lang.Math.*;
/**
 *
 * @author fgh
 */
public class OnePoint implements Point  {

    private float coordinateX;
    private float coordinateY;

    
    public OnePoint(float coordinateX, float coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
    
    public float distanceTo (OnePoint onePoint){
        return (float) (Math.sqrt((this.getX() - onePoint.getX())*(this.getX() - onePoint.getX()) + (this.getY() - onePoint.getY())*(this.getY() - onePoint.getY())));
    }
    
    @Override
    public float getX() {
        return coordinateX;
    }

    @Override
    public float getY() {
        return coordinateY;
    }
    
}
