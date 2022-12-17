import javax.swing.*;
import java.awt.*;

public class Scene extends JPanel implements Runnable {
    Thread gameThread;
    int fireX = 100;
    int fireY = 100;
    int FPS = 60;
    Fire fire = new Fire(this);

    Scene() {
        setBackground(Color.DARK_GRAY);
        setSize(500, 500);
        setVisible(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = 1000000000 / FPS;//0.01666 cekonds
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        while (gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;
            if (delta >= 1) {
                update();
                repaint();
                delta--;

            }
        }
    }

    public void update() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        fire.draw(g2D);
//        g2D.setColor(Color.WHITE);
//        g2D.fillRect(fireX, fireY, 50, 50);

    }

}
