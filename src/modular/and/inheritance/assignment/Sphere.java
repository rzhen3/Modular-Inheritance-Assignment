
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
        radius = -1;
        do{
            try{
                System.out.println("Enter a valid radius:");
                String uInput = scan.nextLine();
                radius = Double.parseDouble(uInput);
                printLB();
                //Check if radius is negative
                if(radius<0)
                    System.out.println("Negative value. Try again");
            }
            catch(NumberFormatException e){
                printLB();
                System.out.println("Not a number. Try again.");
            }
        }while(radius<0);//repeats as long as radius is invalid
    }
    //Method that returns the volume of a sphere
    public double getVolume(double uRad){
        return uRad*uRad*uRad*Math.PI*4/3;
    }
    //Method that returns the surface area of a sphere
    public double getSurfaceArea(double uRad){
        return 4*uRad*uRad*Math.PI;
    }
        
}
//Declare class for cylinder
class Cone extends Cylinder{
    //same variables as cylinder so no need for new constructor
    //Method that returns the volume for specifically, a cylinder
    public double getVolume(double uRad, double uHeight){
        return super.getVolume(uRad, uHeight)/3;
    }
    //Method that returns the surface area of a cylinder
    public double getSurfaceArea(double uRad, double uHeight){
        return Math.PI*uRad*(uRad+Math.sqrt(uHeight*uHeight+uRad*uRad));
    }
        
}
//Declare class for sphere
class Cylinder extends Sphere{
    public double height;
    //Method that gets the  properties of cylinder
    //uses radius so calls the sphere constructor. Added input for height value
    public Cylinder(){
        super();
        height = -1;
        do{
            try{
                System.out.println("Enter a valid height:");
                String uInput = scan.nextLine();
                height = Double.parseDouble(uInput);
                printLB();
                //check if height is negative
                if(height<0)
                    System.out.println("Negative value. Try again");
            }
            catch(NumberFormatException e){
                printLB();
                System.out.println("Not a number. Try again.");
            }
        }while(height<0);//repeats as long as height is invalid
    }
    //Method that returns specfically the volume for a cylinder
    public double getVolume(double uRad, double uHeight){
        return Math.PI*uRad*uRad*uHeight;
    }
    //Method that returns specifically the surface area of a cylinder
    public double getSurfaceArea(double uRad, double uHeight){
        return 2*Math.PI*uRad*uRad + 2*Math.PI*uRad*uHeight;
    }
}
//Declare class for sphere
class Torus extends Sphere{
    public double secondR;
    //Method that sets the torus properties
    //Also uses radius but with a second radius
    public Torus(){
        super();
        secondR = -1;
        do{
            try{
                System.out.println("Enter a valid second radius:");
                String uInput = scan.nextLine();
                secondR = Double.parseDouble(uInput);
                printLB();
                //check for negative and smaller than radius
                if(secondR<0||secondR<radius)
                    System.out.println("Improper value. Try again");
            }
            catch(NumberFormatException e){
                printLB();
                System.out.println("Not a number. Try again.");
            }
        }while(secondR<0||secondR<radius); //repeats as long as secondR is invalid
    }
    //Method that returns the volume of a torus
    public double getVolume(double uRad, double uSecRad){
        return 2*Math.PI*Math.PI*uSecRad*uRad*uRad;
    }
    //Method that returns the surface area of a torus
    public double getSurfaceArea(double uRad, double uSecRad){
        return 2*Math.PI*uRad * 2*Math.PI*uSecRad;
    }
    
}
