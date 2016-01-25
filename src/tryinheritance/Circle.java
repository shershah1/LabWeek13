/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryinheritance;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Circle extends Geometry {

    double radius;

    Circle() {

        radius = 1.0;
    }

    Circle(double r) {

        radius = 1;

    }

    Circle(double r, String c, boolean f) {

        radius = r;

        colour = c;

        filled = f;
    }

    public void setRadius(double r) {

        radius = r;

    }

    public double getRadius() {

        return radius;

    }

    public double getArea() {

        return 2.0 * Math.PI * radius * radius;

    }

    public double getDiameter() {

        return 2.0 * radius;

    }

    public double getPerimeter() {

        return 2.0 * Math.PI * radius;

    }

    public void printCircle() {

        System.out.println("The object " + this.getObject() + " is a Circle ");

        System.out.println("\tradius = " + getRadius());

        System.out.println("\tcolour = " + colour);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("\tdate:" + dateFormat.format(dateCreated));

        System.out.println("\tarea = " + getArea());

        System.out.println("\tdiameter = " + getDiameter());

        System.out.println("\tperimiter = " + getPerimeter());

        System.out.println();

    }

}
