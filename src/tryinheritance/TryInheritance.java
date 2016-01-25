/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryinheritance;
import java.util.Scanner;
public class TryInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

System.out.println("Select a geometric object:");

System.out.println("c for circle\tr for rectangle");

String selected = s.next();

switch(selected)

{

case "c": createCircle(); break;

case "r": createRectangle(); break;

default: System.out.println("No such geometric object defined:" + selected); System.exit(0);

}

}

public static void createCircle()

{

Scanner s = new Scanner(System.in);

System.out.println("Enter radius (double), colour (String), and filled (true or false):");

double r = s.nextDouble();

String c = s.next();

boolean f = s.nextBoolean();

Circle circle = new Circle(r, c, f);

circle.printCircle();

}

public static void createRectangle()

{

Scanner s = new Scanner(System.in);

System.out.println("Enter width (double), height (double), colour (String), and filled (true or false):");

double w = s.nextDouble();

double h = s.nextDouble();

String c = s.next();

boolean f = s.nextBoolean();

Rectangle rect = new Rectangle(w, h, c, f);

rect.printRectangle();

}

}
    
    

