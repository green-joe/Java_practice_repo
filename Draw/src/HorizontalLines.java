import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 3; i++) {
            drawHorizontalLine(i+1*50,i*50,graphics, new Color(i*60,i*120,i*80));

        }

    /* Hozz létre egy függvényt, ami egy vonalat rajzol ki és 3 változót vár:
       az egyenes kiindulási x és y koordinátáit és a graphics-et.
       A függvény rajzoljon egy 50 pixel hosszú vízszintes vonalat a kezdőpontból.
       Használj egy cilklust arra, hogy a függvényeddel 3 vonalat rajzolj.*/



    }
    public static void drawHorizontalLine(int x,int y, Graphics graphics, Color color){
        graphics.setColor(color);
        graphics.drawLine(x,y,x+50,y+50);

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

