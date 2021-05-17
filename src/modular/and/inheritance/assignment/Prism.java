
package modular.and.inheritance.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Roy Zheng
 */
public class Prism{
    //It is assumed that the default/simplest polyhedron is the prism
    static Scanner scan = new Scanner(System.in);
    public Face prismFace;
    public double height;
    public static void printLB(){
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    //Constructor that set dimensions for base's values and height
    public Prism(){
        prismFace = new Face();
        height = -1;
        do{
            try{
                System.out.println("Enter a valid height:");
                String uInput = scan.nextLine();
                height = Double.parseDouble(uInput);
                printLB();
                //check if height is valid
                if(height<0)
                    System.out.println("Negative value. Try again");
            }
            catch(NumberFormatException e){
                printLB();
                System.out.println("Not a number. Try again.");
            }
        }while(height<0);//while height is invalid
    }
    //Method returns the volume of a prism with different face types
    public double getVolume(){
        if(prismFace.sides>=3 && prismFace.sides<=4)
            return prismFace.getArea(prismFace.length, prismFace.width,prismFace.sides)*height;
        else
            return prismFace.getArea(prismFace.length, prismFace.sides)*height;
        
    }
    //Method returns the surface area of a prism with different face types
    public double getSurfaceArea(){
        double otherFaces = 0;
        //Calculating other faces
        for(double i:prismFace.sideList){
            otherFaces=otherFaces+(i*height);
        }
        //calculating the final surface area
        if(prismFace.sides>=3 && prismFace.sides<=4)
            return prismFace.getArea(prismFace.length, prismFace.width,prismFace.sides)*2+ otherFaces;
        
        else
            return prismFace.getArea(prismFace.length, prismFace.sides)*2+otherFaces;
        
    }
}
//Declare class pyramid
class Pyramid extends Prism{
    //Same properties as prism so no need to override constructor
    //Method returns the volume of a pyramid. Practically the same as for a prism except divide by 3
    public double getVolume(){
        return super.getVolume()/3;
    }
    //Method returns the surface area of a pyramid given different face values
    public double getSurfaceArea(){
        double otherFaces = 0;
        //Calculating other faces
        for(double i:prismFace.sideList){
            otherFaces=otherFaces+(i*height/2);
        }
        //calculating final surface area
        if(prismFace.sides>=3 && prismFace.sides<=4)
            return prismFace.getArea(prismFace.length, prismFace.width,prismFace.sides)+otherFaces;
        
        else
            return prismFace.getArea(prismFace.length, prismFace.sides)+otherFaces;
        
    }
}
    