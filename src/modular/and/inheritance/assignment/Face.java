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
    public double[] sideList;
    public static void printLB(){
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    //Constructor that sets the values for faces including the sides, base and height
    public Face(){
        
        sides = -1;
        length=-1;
        width=-1;
        boolean within;
        //getting the number of sides
        do{
            try{
                System.out.println("Enter a valid number of sides for the shape's base: \n"
                        + "Requirements: \n"
                        + "- must be between 3 and 8\n"
                        + "- shapes with sides greater than 4 are assumed to be regular polygons.");
                String uInput = scan.nextLine();
                sides = Integer.parseInt(uInput);
                printLB();
                if(sides==3||sides==4){
                    within = true;
                    break;
                }
                else if(sides>4 && sides<=8){
                    within = false;
                    break;
                }
                else{
                    System.out.println("Invalid number of sides for the base. Try again");
                }
            }
            catch(NumberFormatException e){
                printLB();
                System.out.println("Not a number. Try again");
            }
        }while(true); 
        //Getting the sides
        sideList = new double[sides];
        if(within){
            do{
                try{
                    for(int i = 0;i<sideList.length;i++){
                        System.out.println("Enter one side length:");
                        String uIn = scan.nextLine();
                        double uInput = Double.parseDouble(uIn);
                        printLB();
                        if(uInput<=0){
                            System.out.println("Invalid input. Try again");
                        }
                        else{
                            sideList[i] = uInput;
                        }
                    }
                }
                catch(NumberFormatException er){
                    printLB();
                    System.out.println("Not a number. Restart and try again");
                }
            }while(sideList[sideList.length-1]==0);
        }
        //Getting the length and width
        do{
            try{
                if(within){
                    if(length<0){
                        System.out.println("Enter a valid length:");
                        String uInput = scan.nextLine();
                        length = Double.parseDouble(uInput);
                        printLB();
                    }
                    if(width<0){
                        System.out.println("Enter a valid width:");
                        String uInput = scan.nextLine();
                        width = Double.parseDouble(uInput);
                        printLB();
                    }

                    if(width<0||length<0){
                        System.out.println("Negative input. Try again");
                    }
                }
                else{
                    System.out.println("Enter a valid side length:");
                    String uInput = scan.nextLine();
                    length = Double.parseDouble(uInput);
                    printLB();
                    
                    
                    if(length<0){
                        System.out.println("Negative input. Try again");
                    }
                    else{
                        //populate array
                        for(int i = 0;i<sideList.length;i++){
                            sideList[i] = length;
                        }
                        width = 1;
                    }
                }
            }
            catch(NumberFormatException err){
                printLB();
                System.out.println("Not a number. Try again");
            }
        }while((length<0) || (width <0));
    }
    //Getting area for quadrilaterals and triangles
    public double getArea(double uLength, double uWidth, int sides){
        switch(sides){
            case 3:
                return length*width/2;
            case 4:
                return length*width;
        }
        return -1;
    }
    //getting area for other shapes
    public double getArea(double uLength, int sides){
        switch(sides){
//            case 0:
//                return uLength*uLength*Math.PI;
//            
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
