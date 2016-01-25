/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryinheritance;
import java.util.Date;
public class Geometry {
String colour; 
boolean filled; 
Date dateCreated; 
Geometry()
{
    colour = "black";

filled = false;

dateCreated = new Date();

}

Geometry(String c, boolean f)

{

filled = f;

colour = c;

dateCreated = new Date();

}

public void setColour(String c)

{

this.colour = c;
}

public String getColour()

{

return this.colour;

}

public void setFilled(boolean c)

{

this.filled = c;

}

public boolean getFilled()

{

return this.filled;

}

public Date getDateCreated()

{

return this.dateCreated;

}

public String getObject()

{

return this.toString();


}
}