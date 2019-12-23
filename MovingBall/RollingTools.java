import java.awt.*;
import javax.swing.JFrame;
import java.lang.*;
import java.util.Scanner;

public class RollingTools extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Car");
        Canvas canvas = new RollingTools();
        canvas.setSize(1000, 800);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void paint(Graphics g) {

        //input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a car size: ");
        
        //integer values       
        int z=scan.nextInt();
        scan.close();

        //car position
        int x=z*13;
        int y=z*30;
    
        DrawCar(g, x, y, z);
	DrawRevCar(g, x+400, y, z);
        DrawBall(g, x, y, z);
        DrawRect(g, x, y, z);
        DrawDownCar(g, x+800, y, z);
        DrawUpCar(g, x+50, y+200, z);

    }
      
    public void DrawCar(Graphics g, int x, int y, int z) {
        //Front Box
        g.setColor(Color.RED);
        g.fillRect(x, y-z*15, z*10, z*10);    
        //Load
        g.setColor(Color.BLUE);
        g.fillRect(x+z*8, y-z*20, z*28, z*15);    
        //Base
        g.setColor(Color.RED);
        g.fillRect(x-z*4, y-z*6, z*40, z*7);    
        //Wheels
        g.setColor(Color.BLACK);
        g.fillOval(x, y-z*3, z*10, z*10);
        g.setColor(Color.BLACK);
        g.fillOval(x+z*23, y-z*3, z*10, z*10);
        //Windshield 
        g.setColor(Color.GRAY);
        g.fillRect(x+z, y-z*13, z*6, z*5);    
    }  

    public void DrawRevCar(Graphics g, int x, int y, int z) {
        //Front Box
        g.setColor(Color.RED);
        g.fillRect(x+z*22, y-z*15, z*10, z*10);    
        //Load
        g.setColor(Color.BLUE);
        g.fillRect(x-z*4, y-z*20, z*28, z*15);    
        //Base
        g.setColor(Color.RED);
        g.fillRect(x-z*4, y-z*6, z*40, z*7);    
        //Wheels
        g.setColor(Color.BLACK);
        g.fillOval(x, y-z*3, z*10, z*10);
        g.setColor(Color.BLACK);
        g.fillOval(x+z*23, y-z*3, z*10, z*10);
        //Windshield 
        g.setColor(Color.GRAY);
        g.fillRect(x+z*25, y-z*13, z*6, z*5);    
    }  
   
    public void DrawDownCar(Graphics g, int x, int y, int z) {
        //Front Box
        g.setColor(Color.RED);
        g.fillRect(x+z, y+z*6, z*10, z*10);    
        //Load
        g.setColor(Color.BLUE);
        g.fillRect(x-z, y-z*20, z*15, z*28);    
        //Base
        g.setColor(Color.RED);
        g.fillRect(x-z*6, y-z*20, z*7, z*40);    
        //Wheels
        g.setColor(Color.BLACK);
        g.fillOval(x-z*12, y-z*16, z*10, z*10);
        g.setColor(Color.BLACK);
        g.fillOval(x-z*12, y+z*8, z*10, z*10);
        //Windshield 
        g.setColor(Color.GRAY);
        g.fillRect(x+z*3, y+z*9, z*6, z*5);    
    }  
    
    public void DrawUpCar(Graphics g, int x, int y, int z) {
        //Front Box
        g.setColor(Color.RED);
        g.fillRect(x+z, y-z*18, z*10, z*10);    
        //Load
        g.setColor(Color.BLUE);
        g.fillRect(x+z, y-z*8, z*15, z*28);    
        //Base
        g.setColor(Color.RED);
        g.fillRect(x-z*6, y-z*20, z*7, z*40);    
        //Wheels
        g.setColor(Color.BLACK);
        g.fillOval(x-z*12, y-z*16, z*10, z*10);
        g.setColor(Color.BLACK);
        g.fillOval(x-z*12, y+z*8, z*10, z*10);
        //Windshield 
        g.setColor(Color.GRAY);
        g.fillRect(x+z*3, y-z*16, z*6, z*6);    
    }  
    
    public void DrawBall(Graphics g, int x, int y, int z) {
        g.setColor(Color.RED);
        g.fillOval(x+300, y+200, z*15, z*15);    
    }
    
    public void DrawRect(Graphics g, int x, int y, int z) {
        g.setColor(Color.RED);
        g.fillRect(x+400, y+200, z*40, z*20);    
    }
}
