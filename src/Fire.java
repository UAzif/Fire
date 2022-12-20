import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class Fire {
    public BufferedImage f1, f2, f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17;
    public int x, y;
    Scene scene;

    public Fire(Scene scene) {
        this.scene = scene;
        setDefaultValues();
        getFireImage();
    }

    public void setDefaultValues() {
        x = 50;
        y = 50;
    }

    public void getFireImage() {
        try {
            f1 = ImageIO.read(getClass().getResourceAsStream("f3.png"));
            f2 = ImageIO.read(getClass().getResourceAsStream("f2.png"));
            f3 = ImageIO.read(getClass().getResourceAsStream("f1.png"));
            f4 = ImageIO.read(getClass().getResourceAsStream("f4.png"));
            f5 = ImageIO.read(getClass().getResourceAsStream("f5.png"));
            f6 = ImageIO.read(getClass().getResourceAsStream("f6.png"));
            f7 = ImageIO.read(getClass().getResourceAsStream("f7.png"));
            f8 = ImageIO.read(getClass().getResourceAsStream("f8.png"));
            f9 = ImageIO.read(getClass().getResourceAsStream("f9.png"));
            f10 = ImageIO.read(getClass().getResourceAsStream("f10.png"));
            f11= ImageIO.read(getClass().getResourceAsStream("f11.png"));
            f12 = ImageIO.read(getClass().getResourceAsStream("f12.png"));
            f13 = ImageIO.read(getClass().getResourceAsStream("f13.png"));
            f14 = ImageIO.read(getClass().getResourceAsStream("f14.png"));
            f15 = ImageIO.read(getClass().getResourceAsStream("f15.png"));
            f16 = ImageIO.read(getClass().getResourceAsStream("f16.png"));
            f17 = ImageIO.read(getClass().getResourceAsStream("f17.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void draw(Graphics2D g2D) {
//        g2D.setColor(Color.WHITE);
//        g2D.fillRect(x, y, 50, 50);
        BufferedImage image = null;
        int z =  (int) (Math.random() * 17) + 1;
        switch (z) {
            case 1:
                image = f1;
                break;
            case 2:
                image = f2;
                break;
            case 3:
                image = f3;
                break;
            case 4:
                image = f4;
                break;
            case 5:
                image = f5;
                break;
            case 6:
                image = f6;
                break;
            case 7:
                image = f7;
                break;
            case 8:
                image = f8;
                break;
            case 9:
                image = f9;
                break;
            case 10:
                image = f10;
                break;
            case 11:
                image = f11;
                break;
            case 12:
                image = f12;
                break;
            case 13:
                image = f13;
                break;
        }
        g2D.drawImage(image, x, y, null);
    }
}
