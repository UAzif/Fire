import javax.swing.*;
import java.awt.*;

public class Scene extends JPanel implements Runnable {
    Thread gameThread;
    int FPS = 60;
    Fire fire = new Fire(this);

    Scene() {
        setBackground(Color.DARK_GRAY);
        setSize(400, 700);
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
    }
}
