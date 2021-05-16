/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.and.inheritance.assignment;

import java.util.Scanner;

/**
 *
 * @author Roy Zheng
 */
public class mainProgram{
    static Scanner scan = new Scanner(System.in);
    final static String instructions = "\t\t\tVolume and Surface Area Calculator:\n"
                + "-------------------------------------------------------------\n"
                + "This is a volume and surface area calculator for basic shapes.\n"
                + "You will input the shape for which you desire the volume and surface area.\n"
                + "Next, you can input the relevant specifications of the face you want.\n"
                + "Note for polygons with more than 4 sides, a regular polygon will be assumed\n"
                + "Once that information has been gathered, you can choose to output the surface area or the volume\n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       runProgram();
       System.out.println("Good bye!");
    }
    private static void printLB(){
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    public static String getUserShape(){
        String[] validSelections = {"Prism", "Pyramid", "Sphere", "Cone", "Cylinder", "Torus"};
        System.out.println("List of possible shapes: \n"
                    + "-prism\n"
                    + "-pyramid\n"
                    + "-sphere\n"
                    + "-cone\n"
                    + "-cylinder\n"
                    + "-torus\n"
                    + "Type in your desired shape name(excluding the \"-\")");
        String selectedShape;
        do{
            selectedShape = scan.next().replaceAll(" ", "");
            printLB();
            for(String s: validSelections){
                if(selectedShape.equalsIgnoreCase(s)){
                    return selectedShape.toLowerCase();
                }
            }
            System.out.println("Invalid shape name. Try again");
        }while(true);  
    }
    public static void runProgram(){
        System.out.println(instructions);
        String userInput = getUserShape();
        switch(userInput){
            case "prism":
                //
                Prism uPrism = new Prism();
                doActions(uPrism);
                break;
            case "pyramid":
                //
                Pyramid uPyramid = new Pyramid();
                break;
            case "cone":
                //
                Cone uCone = new Cone();
                break;
            case "cylinder":
                //
                Cylinder uCylinder = new Cylinder();
                break;
            default:
                //
                Torus uTorus = new Torus();
                break;
            
        }
    }
    public static void doActions(Prism uPrism){
        String userInput="";
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uPrism.getSurfaceArea());
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uPrism.getVolume());
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else{
                System.out.println("Command misunderstood. Try again");
            }
        }while(true);
    }
}

