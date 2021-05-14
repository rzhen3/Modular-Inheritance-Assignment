/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.and.inheritance.assignment;

/**
 *
 * @author Roy Zheng
 */
public class mainProgram{


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
            System.out.println(instructions);
        }
    }
    
}

