import java.awt.*;
import javax.swing.JFrame;
import java.lang.*;

public class Drawing extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(500, 500);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        int x=100;
        int y=200;
    
 for(int i=0; i<1000; ++i){
 try {
    if(i==0) {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(x, y+100, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(x, y-100, 100, 100);
    }
    java.lang.Thread.sleep(200);
    if(i%3==0){
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(x, y+100, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(x, y-100, 100, 100);
           }
    else if(i%3==1){
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 100, 100);
        g.setColor(Color.GREEN);
        g.fillOval(x, y+100, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(x, y-100, 100, 100);
                }
    else {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(x, y+100, 100, 100);
        g.setColor(Color.RED);
        g.fillOval(x, y-100, 100, 100);
           }             
      } catch (Exception e) {
          System.out.println(e);
        }  
      }
    }
}
