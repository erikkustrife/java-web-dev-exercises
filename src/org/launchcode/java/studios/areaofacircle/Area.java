package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public double circleArea(final double dRadius){
        return(Math.PI * Math.pow(dRadius, 2d));
    }
    public void halp()
    {
        Double dRadius = 0d;
        Scanner objScanner = new Scanner(System.in);

        System.out.print("Enter the Radius of a Circle.");

        dRadius = objScanner.nextDouble();
        objScanner.close();

        System.out.println();
        System.out.println("The Area of a circle with radius " + dRadius + " is: " + circleArea(dRadius));
    }

    public static void main(String[] args){
        new Area().halp();

    }
}
