import javax.swing.JApplet;
import java.awt.*;

public class fractal extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

   /*
   //x is across and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle
   */  
  
   private int[] xPos = {720, 80, 400, 720};
   private int[] yPos = {600, 600, 40, 600};

   /**
    * Sets up the basic applet environment
    */
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   /**
    * Draws a Triangle using polygons
    */
   public void paint (Graphics page)
   {

        page.setColor(Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   /**
    * draws triangles
    */
   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       //Find the distance between 2 points
       double distance = Math.sqrt(Math.pow((xPos[1]-xPos[2]), 2) + Math.pow((yPos[1]-yPos[2]), 2));
       
       if (distance > 2)
        {
            //calculates x midpoints
            int p4x = (xPos[0] + xPos[1])/2;
            int p5x = (xPos[1] + xPos[2])/2;
            int p6x = (xPos[2] + xPos[3])/2;
            
            //calculates the y midpoints
            int p4y = (yPos[0] + yPos[1])/2;
            int p5y = (yPos[1] + yPos[2])/2;
            int p6y = (yPos[2] + yPos[3])/2;
            
            //creates a new array for right triangle
            int [] NxPos1 = {xPos[0], p4x, p6x, xPos[0]};
            int [] NyPos1 = {yPos[0], p4y, p6y, yPos[0]};
            
            //creates a new array for left triangle
            int [] NxPos2 = {p4x, xPos[1], p5x, p4x};
            int [] NyPos2 = {p4y, yPos[1], p5y, p4y};
            
            //creates a new array for top triangle
            int [] NxPos3 = {p6x, p5x, xPos[2], p6x};
            int [] NyPos3 = {p6y, p5y, yPos[2], p6y};
            
            //draws the triangles
            page.drawPolyline (NxPos1, NyPos1, NxPos1.length);
            page.drawPolyline (NxPos2, NyPos2, NxPos2.length);
            page.drawPolyline (NxPos3, NyPos3, NxPos3.length);
            
            //recursively calls the triangles to keep drawing more triangles
            Triangle(NxPos1, NyPos1, page);
            Triangle(NxPos2, NyPos2, page);  
            Triangle(NxPos3, NyPos3, page);
            
            
        }
   }
   
}//end of Triangle

