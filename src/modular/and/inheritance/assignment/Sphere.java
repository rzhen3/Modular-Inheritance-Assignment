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
public class Sphere{
    public double radius;
    //Line break
    public static void printLB(){
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    //Initialize the sphere's properties
    public Sphere(){
        //get radius
        do{
            try{
                System.out.println("Enter a valid radius:");
                String uInput = scan.nextLine();
                radius = Double.parseDouble(uInput);
                printLB();
                if(radius<0)
                    System.out.println("Negative value. Try again");
                else
                    break;
            }
            catch(NumberFormatException e){
                printLB();
                System.out.println("Not a number. Try again.");
            }
        }while(true);
    }
    //Method that returns the volume of a sphere
    public double getVolume(){
        return radius*radius*radius*Math.PI*4/3;
    }
    //Method that returns the surface area of a sphere
    public double getSurfaceArea(){
        return 4*radius*radius*Math.PI;
    }
        
}
//Declare class for cylinder
class Cone extends Cylinder{
    //same variables as cylinder so no need for new constructor
    //Method that returns the volume for specifically, a cylinder
    public double getVolume(){
        return super.getVolume()/3;
    }
    //Method that returns the surface area of a cylinder
    public double getSurfaceArea(){
        return Math.PI*radius*(radius+Math.sqrt(height*height+radius*radius));
    }
        
}
//Declare class for sphere
class Cylinder extends Sphere{
    public double height;
    //Method that gets the  properties of cylinder
    //Same thing sphere so calls the sphere constructor. Added input for height value
    public Cylinder(){
        super();
        do{
            try{
                System.out.println("Enter a valid height:");
                String uInput = scan.nextLine();
                height = Double.parseDouble(uInput);
                printLB();
                if(height<0)
                    System.out.println("Negative value. Try again");
                else
                    break;
            }
            catch(NumberFormatException e){
                printLB();
                System.out.println("Not a number. Try again.");
            }
        }while(true);
    }
    //Method that returns specfically the volume for a cylinder
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
    //Method that returns specifically the surface area of a cylinder
    public double getSurfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
}
//Declare class for sphere
class Torus extends Sphere{
    public double secondR;
    //Method that sets the torus properties
    //Same thing as sphere but with a second radius
    public Torus(){
        super();
        do{
            try{
                System.out.println("Enter a valid second radius:");
                String uInput = scan.nextLine();
                secondR = Double.parseDouble(uInput);
                printLB();
                if(secondR<0||secondR<radius)
                    System.out.println("Improper value. Try again");
                else
                    break;
            }
            catch(NumberFormatException e){
                printLB();
                System.out.println("Not a number. Try again.");
            }
        }while(true);
    }
    //Method that returns the volume of a torus
    public double getVolume(){
        return 2*Math.PI*Math.PI*secondR*radius*radius;
    }
    //Method that returns the surface area of a torus
    public double getSurfaceArea(){
        return 2*Math.PI*radius * 2*Math.PI*secondR;
    }
    
}
