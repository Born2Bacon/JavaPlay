import java.awt.*;
import javax.swing.JFrame;
import java.lang.*;
import java.util.Scanner;

public class Car extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Car");
        Canvas canvas = new Car();
        canvas.setSize(800, 700);
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
}
