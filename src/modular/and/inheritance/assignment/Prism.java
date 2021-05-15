/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular.and.inheritance.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Roy Zheng
 */
public class Prism {
    //It is assumed that the default/simplest polyhedron is the prism
    static Scanner scan = new Scanner(System.in);
    public Face prismFace;
    public double height;
    public Prism(){
        prismFace = new Face();
        height = -1;
        do{
            try{
                if(height<0){
                    System.out.println("Enter a valid height:");
                    height=scan.nextDouble();
                }
                else{
                    System.out.println("Negative value. Try again");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Not a number. Try again.");
            }
        }while(true);
    }
    public void changeSpec(){
        prismFace = new Face();
        height = -1;
        do{
            try{
                if(height<0){
                    System.out.println("Enter a valid height:");
                    height=scan.nextDouble();
                }
                else{
                    System.out.println("Negative value. Try again");
                }
            }
            catch(InputMismatchException e){
                System.out.println("Not a number. Try again.");
            }
        }while(true);
    }
        
}
class Pyramid extends Prism{
    
}
    