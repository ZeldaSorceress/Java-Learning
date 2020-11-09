import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {

    private JFrame frame;
    private Canvas canvas;
    
    private String title;
    private int width, height;
    
    public Display(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;
        
        createDisplay();
    }
    
    private void createDisplay(){
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setIconImage(ImageLoader.loadImage("C:\\Users\\kbarr\\OneDrive\\Desktop\\zeldatriforce.png"));

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setFocusable(false); // Makes it so JFrame is the only thing that has focus
        
        frame.add(canvas); // Adds the canvas to the frame
        frame.pack(); // Resizes window slightly in order to see window completely
    }
    
    public Canvas getCanvas(){
        return canvas;
    }
    
    public JFrame getFrame(){
        return frame;
    }
    
}
