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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runProgram();
    }
    public static void runProgram(){
        String instructions = "\t\t\tVolume and Surface Area Calculator:\n"
                + "-------------------------------------------------------------\n"
                + "This is a volume and surface area calculator for basic shapes.\n"
                + "You will input the shape for which you desire the volume and surface area.\n"
                + "Next, you can input the relevant specifications of the face you want.\n"
                + "Note for polygons with more than 4 sides, a regular polygon will be assumed\n"
                + "Once that information has been gathered, you can choose to output the surface area or the volume\n";
        
        boolean continuePlaying = true;
        while(continuePlaying){
            Shape userShape;
            System.out.println(instructions);
            String userInput = getUserShape();
            switch(userInput){
                case "prism":
                    //
                    break;
                case "pyramid":
                    //
                    break;
                case "sphere":
                    //
                    break;
                case "cone":
                    //
                    break;
                case "cylinder":
                    //
                    break;
                default:
                    //
                    break;
            }
            
            System.out.println(userInput);
               
        }
    }
    public static String getUserShape(){
        String[] validSelections = {"Prism", "Pyramid", "Sphere", "Cone", "Cylinder", "Torus"};
        System.out.println("List of possible shapes: "
                    + "-prism\n"
                    + "-pyramid\n"
                    + "-sphere\n"
                    + "-cone\n"
                    + "-cylinder\n"
                    + "-torus\n"
                    + "Type in your desired shape name");
        String selectedShape;
//        boolean valid = false;
//        do{
//            selectedShape = scan.next().replaceAll(" ", "");
//            for(String s: validSelections){
//                if(selectedShape.equalsIgnoreCase(s)){
//                    return selectedShape;
//                }
//            }
//        }while(!valid);
        for(;;){
            selectedShape = scan.next().replaceAll(" ", "");
            for(String s: validSelections){
                if(selectedShape.equalsIgnoreCase(s)){
                    return selectedShape.toLowerCase();
                }
            }
            System.out.println("Invalid shape name. Try again");
        }
        
    }
    
}

