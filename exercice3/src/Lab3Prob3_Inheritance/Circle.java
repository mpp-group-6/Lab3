/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3Prob3_Inheritance;

/**
 *
 * @author Emmanuel Cadet
 */
public class Circle extends Cylinder{
       
    public Circle(double radius){
        super(radius,0);
    }
    
    public double computeArea(){
        double pi=3.142;
        double radius=super.getRadius();
        return pi*(radius*radius);
    }
    
}
