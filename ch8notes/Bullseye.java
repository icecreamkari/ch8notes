
import java.applet.Applet;
import java.awt.*;

public class Bullseye extends Applet
{
    //Graphics page;
   //-----------------------------------------------------------------
   //  Paints a bullseye target.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        drawCircle(400, 100, 500,page);

        //drawCircle(600, 600, 100,page);



      /**/
   }// end of paint

   void drawCircle(int x, int y, float radius,Graphics page) {

      page.drawOval(x,y,(int)radius,(int)radius);
      
      radius *= .75;
      
      x += radius/5;
      y += radius/5;
      
      if (radius > 20)
      {
            //drawCircle(x, y, radius, page);
            
            if(x%2 == 0)
            {   
                page.setColor(Color.black);
                drawCircle((int)(x+radius/2), y, radius, page);
                drawCircle((int)(x-radius/2), y, radius, page);
            }
            else
            {
                page.setColor(Color.red);
                drawCircle((int)(x+radius/2), y, radius, page);
                drawCircle((int)(x-radius/2), y, radius, page);
            }
            
            if(y%2 == 0)
            {
                page.setColor(Color.cyan);
                drawCircle(x, (int)(y+radius/2), radius, page);
                drawCircle(x, (int)(y-radius/2), radius, page);
            }
            else
            {
                page.setColor(Color.magenta);
                drawCircle(x, (int)(y+radius/2), radius, page);
                drawCircle(x, (int)(y-radius/2), radius, page);
            }
      }
    }//end of drawCircle
}//end of class
