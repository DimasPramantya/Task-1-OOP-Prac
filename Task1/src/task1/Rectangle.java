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
public class Rectangle implements CalculateFlatField {
    public double length;
    public double width;

    @Override
    public double getArea() {
        return(this.width*this.length);
    }

    @Override
    public double getRound() {
        return(2*(this.width+this.length));
    }
}
