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
public class Sphere {
    public double radius;
    public static void printLB(){
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    public Sphere(){
        //get radius
        do{
            try{
                System.out.println("Enter a valid radius:");
                radius=scan.nextDouble();
                printLB();
                if(radius<0)
                    System.out.println("Negative value. Try again");
                else
                    break;
            }
            catch(InputMismatchException e){
                System.out.println("Not a number. Try again.");
            }
        }while(true);
    }
    public double getVolume(){
        return radius*radius*radius*Math.PI*4/3;
    }
    public double getSurfaceArea(){
        return 4*radius*radius*Math.PI;
    }
        
}
class Cone extends Cylinder{
    public double getVolume(){
        return super.getVolume()/3;
    }
    public double getSurfaceArea(){
        return Math.PI*radius*(radius+Math.sqrt(height*height+radius*radius));
    }
        
}
class Cylinder extends Sphere{
    public double height;
    public Cylinder(){
        super();
        do{
            try{
                System.out.println("Enter a valid height:");
                height=scan.nextDouble();
                printLB();
                if(height<0)
                    System.out.println("Negative value. Try again");
                else
                    break;
            }
            catch(InputMismatchException e){
                System.out.println("Not a number. Try again.");
            }
        }while(true);
    }
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
    public double getSurfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
}
class Torus extends Sphere{
    public double secondR;
    public Torus(){
        super();
        do{
            try{
                System.out.println("Enter a valid second radius:");
                secondR=scan.nextDouble();
                printLB();
                if(secondR<0)
                    System.out.println("Negative value. Try again");
                else
                    break;
            }
            catch(InputMismatchException e){
                System.out.println("Not a number. Try again.");
            }
        }while(true);
    }
    public double getVolume(){
        return 2*Math.PI*Math.PI*secondR*radius;
    }
    public double getSurfaceArea(){
        return 2*Math.PI*radius * 2*Math.PI*secondR;
    }
    
}
