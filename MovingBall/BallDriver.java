import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class BallDriver {

    // Window size
    static int  windowW = 900;
    static int  windowH = 800;

    // The main() function for the class RollingBallJC
    public static void main(String[] args) {

        // Create the fame
        JFrame frame = new JFrame("My Horizontal Ball");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(windowW, windowH);
        frame.setLocationRelativeTo(null);

        // Create the ball
        StraightBall ballgame = new StraightBall( windowW,
                                                 windowH );

        // Set up the frame by adding the 'ballgame'  and set
        // other attribute
        frame.add(ballgame);

        frame.setVisible(true);

        frame.setTitle("Straight Ball");
   }


} 

class StraightBall extends JComponent {

    // Window size
    private int  myWinW;
    private int  myWinH;

    // ball size
    static int   ballSizeX = 50;
    static int   ballSizeY = 50;

    // global variable
    int   ballPositionX = 0;
    int   ballPositionY = 0;
    int   tableendX = 0;
    int   tablemiddleX = 0;
    int   tableendY = 0;

    RollingTools myRollingToolsObj;  
 
    // Start the ball moving to right direction
    boolean  moveToRight = true;
  
    public StraightBall(int winX, int winH) {

         myWinW = winX - ballSizeX;
         myWinH = winH;
         tableendX = winX - 100;
         tablemiddleX = tableendX/2 + ballSizeX/2;
         tableendY = ballPositionY + myWinH/3;
         myRollingToolsObj = new RollingTools();

         Thread animationThread = new Thread(new Runnable() {
            public void run() {

               while(true) {

                  repaint();

                  try { Thread.sleep(3); } catch (Exception ex) {}
               }
            }
         });

         // Start the ball rolling !
         animationThread.start();
    }

 
    public void paintComponent(Graphics g) {
    
      if ( moveToRight )
      { 
         if( ballPositionX < tableendX/2 - ballSizeX/2 )
         {
           ++ballPositionX;
         }
         else
         {
            // if ball hits the right wall, change direction
            // if moveToRight, and the ball position X is not
            // smaller than windowW, then it must be 
            // ( ballPositionX == windowW )
          
            moveToRight = false;
            //--ballPositionX; 
         }
       }
       else
       { 
          if(tablemiddleX < tableendX )
          {     
                 ++tablemiddleX;
          }
          else
          { 
            if(tableendY < myWinH - 150)
            {
               ++tableendY;
            }
          

          }

       }        
       // must moving to left because moveToRight is false
       /*{
          // we need to check if hitting the left wall
          if ( ballPositionX == 0 )
          {
             moveToRight = true;
             ++ballPositionX;
          }
          else // If not hitting the left wall yet,
               // continue moving left
          {
             --ballPositionX;
          }
       }*/
        
       g.setColor(Color.RED);
       g.fillOval(ballPositionX, ballPositionY + myWinH/3, ballSizeX, ballSizeY);
       g.setColor(Color.BLUE);
       g.fillOval(tablemiddleX, tableendY, ballSizeX, ballSizeY);
       g.setColor(Color.GREEN);
       //g.setStroke(new BasicStroke(10));
       //g.drawLine(200, 200, 600, 200);
       int Yposition = ballPositionY + myWinH/3 + ballSizeX + 2;
       Graphics2D g2 = (Graphics2D) g;
       g2.setStroke(new BasicStroke(5));
       g2.draw(new Line2D.Float(0, Yposition, tableendX, Yposition));
    }
}
