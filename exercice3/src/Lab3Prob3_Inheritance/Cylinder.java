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
public class Cylinder {
    private double height;
    private double radius;
    
    public Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double computeVolume(){
        double pi=3.142;
        return pi*(radius*radius)*height;
    }
    
}
