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
        //Find the distance between 2 points ex. - x,y & x1,y1
        double distance = Math.sqrt(Math.pow((xPos[1]-xPos[2]), 2) + Math.pow((yPos[1]-yPos[2]), 2));


        if (distance > 10)
        {
            //middle triangle
            //calculates the x midpoints
            int ABMidx = (xPos[0] + xPos[1])/2;
            int BCMidx = (xPos[1] + xPos[2])/2;
            int CAMidx = (xPos[2] + xPos[3])/2;
            
            //calculates the y midpoints
            int ABMidy = (yPos[0] + yPos[1])/2;
            int BCMidy = (yPos[1] + yPos[2])/2;
            int CAMidy = (yPos[2] + yPos[3])/2;
       
            //creates a new array
            int[] NxPos = {ABMidx, BCMidx, CAMidx, ABMidx};
            int[] NyPos = {ABMidy, BCMidy, CAMidy, ABMidy};
            
            //draws the triangle
            page.drawPolyline (NxPos, NyPos, NxPos.length);
            Triangle(NxPos,NyPos,page);

                        
            //-----------------------------------
            
            
            //right triangle
            //calculates the x midpoints            
            int rABMidx = (xPos[0] + NxPos[0])/2;
            int rBCMidx = (NxPos[0] + NxPos[2])/2;
            int rCAMidx = (NxPos[2] + xPos[0])/2;
            
            //calculates the y midpoints            
            int rABMidy = (yPos[0] + NyPos[0])/2;
            int rBCMidy = (NyPos[0] + NyPos[2])/2;
            int rCAMidy = (NyPos[2] + yPos[0])/2;
       
            //creates a new array       
            int[] RxPos = {rABMidx, rBCMidx, rCAMidx, rABMidx};
            int[] RyPos = {rABMidy, rBCMidy, rCAMidy, rABMidy};
            
            //draws the triangle            
            page.drawPolyline (RxPos, RyPos, RxPos.length);
            Triangle(RxPos,RyPos,page);
            
            
            
            //-----------------------------------
            
            
            //left triangle
            //calculates the x midpoints
            int lABMidx = (NxPos[0] + xPos[1])/2;
            int lBCMidx = (xPos[1] + NxPos[1])/2;
            int lCAMidx = (NxPos[1] + NxPos[0])/2;
            
            //calculates the y midpoints            
            int lABMidy = (NyPos[0] + yPos[1])/2;
            int lBCMidy = (yPos[1] + NyPos[1])/2;
            int lCAMidy = (NyPos[1] + NyPos[0])/2;
       
            //creates a new array       
            int[] LxPos = {lABMidx, lBCMidx, lCAMidx, lABMidx};
            int[] LyPos = {lABMidy, lBCMidy, lCAMidy, lABMidy};
            
            //draws the triangle            
            page.drawPolyline (LxPos, LyPos, LxPos.length);
            Triangle(LxPos,LyPos,page);
            
            
            //-----------------------------------
            
            //top triangle
            //calculates the x midpoints
            int tABMidx = (NxPos[2] + NxPos[1])/2;
            int tBCMidx = (NxPos[1] + xPos[2])/2;
            int tCAMidx = (xPos[2] + NxPos[2])/2;
            
            //calculates the y midpoints            
            int tABMidy = (NyPos[2] + NyPos[1])/2;
            int tBCMidy = (NyPos[1] + yPos[2])/2;
            int tCAMidy = (yPos[2] + NyPos[2])/2;
       
            //creates a new array       
            int[] TxPos = {tABMidx, tBCMidx, tCAMidx, tABMidx};
            int[] TyPos = {tABMidy, tBCMidy, tCAMidy, tABMidy};
            
            //draws the triangle            
            page.drawPolyline (TxPos, TyPos, TxPos.length);
            Triangle(TxPos,TyPos,page);
        }



   }//end of Triangle
}
