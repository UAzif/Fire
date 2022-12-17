import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class Fire {
    public BufferedImage f1, f2, f3;
    public int x, y;
    Scene scene;

    public Fire(Scene scene) {
        this.scene = scene;
        setDefaultValues();
        getFireImage();
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
    }

    public void getFireImage() {
        try {
            f1 = ImageIO.read(getClass().getResourceAsStream("f3.png"));
            f2 = ImageIO.read(getClass().getResourceAsStream("f2.png"));
            f3 = ImageIO.read(getClass().getResourceAsStream("f1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void draw(Graphics2D g2D) {
//        g2D.setColor(Color.WHITE);
//        g2D.fillRect(x, y, 50, 50);
        BufferedImage image = null;
        int x =  (int) (Math.random() * 3) + 1;
        switch (x) {
            case 1:
                image = f1;
                break;
            case 2:
                image = f2;
                break;
            case 3:
                image = f3;
                break;
        }
        g2D.drawImage(image, x, y, null);
    }
}
