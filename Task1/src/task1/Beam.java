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
public class Beam extends Rectangle implements CalculateSpace {
    
    public double height;
    
    Beam(double width, double length, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }
    
    @Override
    public double getVolume() {
        return this.getArea()*this.height;
    }
}
