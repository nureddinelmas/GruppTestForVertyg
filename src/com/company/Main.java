/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dobject;

/**
 *
 * @author nureddin
 */
import com.company.Circle;
import com.company.Rektangel;

import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculate();


    }

    public static void Calculate(){

        System.out.print("För Rektangel tryck 1, För Cirkel tryck 2 ");
        int command = sc.nextInt();

        switch(command){

            case 1 -> {
                // getArea()

                System.out.print("Mata in bas : ");
                double bas = sc.nextDouble();

                System.out.print("Mata in höjd : ");
                double hojd = sc.nextDouble();


                System.out.println("Area : "+Rektangel.getArea(bas, hojd));
                System.out.println("Omkrets : "+ Rektangel.getOmkrets(bas, hojd));
            }


            case 2 -> {
                //getCirkel

                System.out.println("Enter Radius of Circle: ");

                double radius = sc.nextDouble();

                Circle circle = new Circle(radius);
                System.out.println("Area of Circle is: " + circle.area());
                System.out.println("Circumference of Circle is: " + circle.circumference());
            }

        }

    }
}


