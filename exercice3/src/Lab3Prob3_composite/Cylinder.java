/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3Prob3_composite;


/**
 *
 * @author Emmanuel Cadet
 */
public class Cylinder {
    private double height;
    private Circle circle;
    
    public Cylinder(double radius,double height){
        circle=new Circle(radius);
        this.height=height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public Circle getCircle(){
        return circle;
    }
    
    public double computeVolume(){
        return circle.computeArea()*height;
    }
    
}
