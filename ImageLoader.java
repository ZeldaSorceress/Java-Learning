import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader {
    
    public static BufferedImage loadImage(String path){
        try {
            return ImageIO.read(ImageLoader.class.getResource(path)); // Tries to return a buffered image object of loaded image
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
        
    }
    
}
