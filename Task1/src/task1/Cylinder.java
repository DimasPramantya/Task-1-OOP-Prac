/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Lenovo
 */
public class Cylinder extends Circle implements CalculateSpace {
    public double height;

    Cylinder(double radius, double height){
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (this.getArea()*this.height);
    }
}
