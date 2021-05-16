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
    static boolean continuePlaying = true;
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
    //Line break method
    private static void printLB(){
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    //Method that gets user shape (may be removed)
    public static String getUserShape(){
//        String[] validSelections = {"Prism", "Pyramid", "Sphere", "Cone", "Cylinder", "Torus"};
        System.out.println("List of possible shapes: \n"
                    + "-prism\n"
                    + "-pyramid\n"
                    + "-sphere\n"
                    + "-cone\n"
                    + "-cylinder\n"
                    + "-torus\n"
                + "To quit, type in anything else.\n"
                    + "Enter your desired shape name(excluding the \"-\")");
//        String selectedShape;
//        do{
//            selectedShape = scan.next().replaceAll(" ", "");
//            printLB();
//            for(String s: validSelections){
//                if(selectedShape.equalsIgnoreCase(s)){
//                    return selectedShape.toLowerCase();
//                }
//            }
//            System.out.println("Invalid shape name. Try again");
//        }while(true);  
        
         return scan.next().replaceAll(" ","");
    }
    //Main run program method
    public static void runProgram(){
        do{
            System.out.println(instructions);
            String userInput = getUserShape();
            printLB();
            switch(userInput){
                case "prism":
                    doActions(new Prism());
                    break;
                case "pyramid":
                    doActions(new Pyramid());
                    break;
                case "sphere":
                    doActions(new Sphere());
                    break;
                case "cone":
                    doActions(new Cone());
                    break;
                case "cylinder":
                    doActions(new Cylinder());
                    break;
                case "torus":
                    doActions(new Torus());
                    break;
                default:
                    continuePlaying = false;
                    break;
            }
        }while(continuePlaying == true);
        
    }
    
    
    //Creating a program that executes actions for each shape
    
    //Overload for prism
    public static void doActions(Prism uPrism){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uPrism.getSurfaceArea());
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uPrism.getVolume());
            else if(userInput.equalsIgnoreCase("change"))
                uPrism = new Prism();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else{
                System.out.println("Command misunderstood. Try again");
            }
        }while(true);
    }
    //OVerload for pyramid
    public static void doActions(Pyramid uPyramid){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uPyramid.getSurfaceArea());
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uPyramid.getVolume());
            else if(userInput.equalsIgnoreCase("change"))
                uPyramid = new Pyramid();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else{
                System.out.println("Command misunderstood. Try again");
            }
        }while(true);
    }
    //Overload for sphere
    public static void doActions(Sphere uSphere){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uSphere.getSurfaceArea());
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uSphere.getVolume());
            else if(userInput.equalsIgnoreCase("change"))
                uSphere = new Sphere();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else{
                System.out.println("Command misunderstood. Try again");
            }
        }while(true);
    }
    //Overload for cone
    public static void doActions(Cone uCone){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uCone.getSurfaceArea());
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uCone.getVolume());
            else if(userInput.equalsIgnoreCase("change"))
                uCone = new Cone();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else{
                System.out.println("Command misunderstood. Try again");
            }
        }while(true);
    }
    //Overload for cylinder
    public static void doActions(Cylinder uCylinder){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uCylinder.getSurfaceArea());
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uCylinder.getVolume());
            else if(userInput.equalsIgnoreCase("change"))
                uCylinder = new Cylinder();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else{
                System.out.println("Command misunderstood. Try again");
            }
        }while(true);
    }
    //Overload for torus
    public static void doActions(Torus uTorus){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uTorus.getSurfaceArea());
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uTorus.getVolume());
            else if(userInput.equalsIgnoreCase("change"))
                uTorus = new Torus();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else{
                System.out.println("Command misunderstood. Try again");
            }
        }while(true);
    }
}

