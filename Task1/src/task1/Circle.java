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
public class Circle implements CalculateFlatField{
    //this is the encapsulation
    private final double phi = 3.14;
    
    public double radius; 
    
    public double getPhi(){
        return this.phi;
    }

    @Override
    public double getArea() {
        return (this.phi*this.radius*this.radius);
    }

    @Override
    public double getRound() {
        return (this.phi*this.radius*2);
    }
    

}


