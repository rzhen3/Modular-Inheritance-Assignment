/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.and.inheritance.assignment;

import java.util.InputMismatchException;
import static modular.and.inheritance.assignment.Prism.scan;

/**
 *
 * @author Roy Zheng
 */
public class Face {
    //only supports up to 8 sides
    double length;
    double width;
    int sides;
    public Face(){
        length=-1;
        width=-1;
        
        do{
            try{
                if(length<0){
                    System.out.println("Enter a valid height:");
                    length = scan.nextDouble();
                }
                if(width<0){
                    System.out.println("Enter a valid width:");
                    width = scan.nextDouble();
                }

                if(width<0||length<0){
                    System.out.println("Negative input. Try again");
                }
                
            }
            catch(InputMismatchException e){
                System.out.println("Not a number. Try again");
            }
        }while(true);
    }
    public double getArea(double uLength, double uWidth, int sides){
        switch(sides){
            case 3:
                return length*width/2;
            case 4:
                return length*width;
        }
        return -1;
    }
    public double getArea(double uLength, int sides){
        switch(sides){
            case 0:
                return uLength*uLength*Math.PI;
            
            case 5:
                return 0.25*Math.sqrt(5*(5+2*Math.sqrt(5)))*uLength*uLength;
            case 6:
                return (3*Math.sqrt(3))/2*uLength*uLength;
            case 7:
                return uLength*uLength*(1/Math.tan(0.448799))*7/4;
            case 8:
                return 2*(1+Math.sqrt(2))*uLength*uLength;
        }
        return -1;
    }
}
