/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.shapes;

/**
 *
 * @author fgh
 */
public class onePoint implements Point  {

    private float coordinateX;
    private float coordinateY;

    public onePoint(float coordinateX, float coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
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
