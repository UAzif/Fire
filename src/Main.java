import javax.swing.*;

public class Main extends JFrame {
    Main(){
      ;
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500,515);
      setLocation(200,200);
      Scene sc= new Scene();
      add(sc);
      setVisible(true);
      sc.startGameThread();
    }

    public static void main(String[] args) {
        setDefaultLookAndFeelDecorated(true);
        new Main();
    }
}
