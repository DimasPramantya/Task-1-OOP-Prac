/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.*;

/**
 *
 * @author Lenovo
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cylinder cylinder = new Cylinder(0,0);
        Beam beam = new Beam(0,0,0);
        int menu;
        Scanner sc= new Scanner(System.in); 
        while(true){
            System.out.println("\nAREA & VOLUME CALCULATOR");
            System.out.println("1.Beam");
            System.out.println("2.Cylinder");
            System.out.println("3.Exit");
            System.out.print("Menu : ");
            menu = sc.nextInt();
            if(menu == 1){
                System.out.print("Input Length : ");
                beam.length = sc.nextDouble();
                System.out.print("Input Width : ");
                beam.width = sc.nextDouble();
                System.out.print("Input height : ");
                beam.height = sc.nextDouble();
                System.out.println("\nRESULT");
                System.out.println("Rectangle Area : " + beam.getArea());
                System.out.println("Rectangle Round : " + beam.getRound());
                System.out.println("Beam Volume : " + beam.getVolume());
            }else if(menu == 2){
                System.out.print("Input Radius : ");
                cylinder.radius = sc.nextDouble();
                System.out.print("Input Height : ");
                cylinder.height = sc.nextDouble();
                System.out.println("\nRESULT");
                System.out.println("Circle Area : " + cylinder.getArea());
                System.out.println("Circle Round : " + cylinder.getRound());
                System.out.println("Cylinder Volume : " + cylinder.getVolume());
            }else{
                break;
            }
        }
    }
}
