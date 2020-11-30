import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Rajzolj egy négyzetet, aminek minden oldala más színű!
        graphics.setColor(Color.RED);
        graphics.drawLine(50,100,150,100);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(150,100,150,200);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(150,200,50,200);
        graphics.setColor(Color.black);
        graphics.drawLine(50,200,50,100);
        // Rajzold meg a vászon átlóit!
        // A bal felső saroból induló legyen zöld, a másik pedig piros!
        graphics.setColor(Color.green);
        graphics.drawLine(0,0,320,320);
        graphics.setColor(Color.red);
        graphics.drawLine(320,0,0,320);

    }

    /// Boilerplate kód. A graphics működéséhez kell. Nem kell piszkálni.
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


