
package tryinheritance;


public class Rectangle extends Geometry {

double height,width;


Rectangle() {
 height = 1.0;
 width = 1.0;
}
    

    Rectangle (double h,double w) {

        height = 1;
        width = 1;

    }

    Rectangle(double h,double w, String c, boolean f) {

        height = h;
        width = w;
        colour = c;

        filled = f;
    }

    public void setHeight(double h) {

        height = h;

    }

    public double getHeight(double h ) {

        return height;

    }

    public void setWidth(double w) {

        width = w;

    }

    public double getWidth(double h ) {

        return width;

    }
    
    
    public double getArea() {

        double area = width*height;
        return area;

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
    
    
    
}
