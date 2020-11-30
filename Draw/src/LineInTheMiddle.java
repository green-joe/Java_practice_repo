import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class LineInTheMiddle {
           public static void mainDraw(Graphics graphics){
               // Rajzolj egy piros vízszintes vonalat a vászon közepéig!
               graphics.setColor(Color.RED);
               graphics.drawLine(0, 50, 160, 50);
               // Rajzolj egy zöld függőleges vonalat a vászon közepéig!
               graphics.setColor(Color.green);
               graphics.drawLine(160,50,160,160);


        }

        // Boilerplate kód. A graphics működéséhez kell. Nem kell piszkálni.
        static int WIDTH = 320;  // vászon szélessége
        static int HEIGHT = 320; // vászon magassága

        public static void main(String[] args) {
            JFrame jFrame = new JFrame("Drawing");
            jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ImagePanel panel = new ImagePanel();
            panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            jFrame.add(panel);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            jFrame.pack();
        }

        static class ImagePanel extends JPanel {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                mainDraw(graphics);
            }
        }

}
