package lab9.AppliedCode;

import java.awt.*; 
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    private final Color customRed = new Color(0.639f, 0.114f, 0.114f);
    private DrawOption drawOption = DrawOption.CLEAR;
    private Graphics2D graphics2D;
    private int x1;
    private int y1;
    
    public void draw(String s)
    {
        drawOption = DrawOption.valueOf(s);
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics); 
        graphics2D = (Graphics2D)graphics;
        BasicStroke pen;
        graphics2D.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON); 
        switch (drawOption)
        {
            case LINE ->
            {
                pen = new BasicStroke(
                        20,
                        BasicStroke.CAP_ROUND,
                        BasicStroke.JOIN_ROUND);
                graphics2D.setStroke(pen);
                graphics2D.setColor(Color.blue);
                graphics2D.drawLine(
                        20,
                        20,
                        100,
                        100);
            }
            
            case OVAL ->
            {
                float[] dash = { 10, 30 };
                pen = new BasicStroke(
                        10,
                        BasicStroke.CAP_SQUARE,
                        BasicStroke.JOIN_ROUND,
                        10,
                        dash,
                        0);
                graphics2D.setStroke(pen);
                graphics2D.setColor(Color.red);
                GradientPaint gradientPaint = new GradientPaint(
                        30,
                        30,
                        Color.red,
                        50,
                        50,
                        Color.green,
                        true);
                graphics2D.setPaint(gradientPaint);
                Ellipse2D.Double elDouble = new Ellipse2D.Double(
                        20,
                        20,
                        100,
                        100);
                graphics2D.fill(elDouble);
            }
            
            case RECT ->
            {
                float[] dash2 = {20, 20};
                pen = new BasicStroke(
                        5,
                        BasicStroke.CAP_SQUARE,
                        BasicStroke.JOIN_BEVEL,
                        1,
                        dash2,
                        0);
                graphics2D.setStroke(pen);
                graphics2D.setColor(Color.magenta);
                graphics2D.drawRect(
                        20,
                        20,
                        100,
                        100);
            }
            
            case ROUNDRECT ->
            { 
                float[] dash3 = { 20, 20, 2, 20, 2, 20 };
                pen = new BasicStroke(
                        10,
                        BasicStroke.CAP_ROUND,
                        BasicStroke.JOIN_BEVEL,
                        1,
                        dash3,
                        0);
                graphics2D.setStroke(pen);
                graphics2D.setColor(Color.yellow);
                graphics2D.drawRoundRect(
                        20,
                        20,
                        100,
                        100,
                        60,
                        60);
            }
            
            case CLEAR ->
            {
                Dimension dimension = getSize();
                graphics2D.clearRect(
                        0,
                        0,
                        dimension.width,
                        dimension.height);
            }
            
            case LAST_NAME ->
            {
                x1 = 20;
                y1 = 20;
                
                // В
                graphics2D.setColor(Color.BLUE);
                customPen(3);
                drawLine(0, 0, 0, 100);
                drawLine(0, 0, 25, 25);
                drawLine(25, 25, 0, 50);
                drawLine(0, 50, 25, 75);
                drawLine(25, 75, 0, 100);
                
                // Ы
                setVowelStyle();
                x1 = 70;
                drawLine(0, 0, 0, 100);
                drawLine(0, 50, 25, 75);
                drawLine(25, 75, 0, 100);

                x1 = 110;
                drawLine(0, 0, 0, 100);
                
                // Ш
                setConsonantStyle();
                x1 = 130;
                drawLine(0, 0, 0, 100);
                drawLine(20, 0, 20, 100);
                drawLine(40, 0, 40, 100);
                drawLine(0, 100, 40, 100);
                
                // Е
                setVowelStyle();
                x1 = 190;
                drawLine(0, 0, 0, 100);
                drawLine(0, 0, 30, 0);
                drawLine(0, 50, 30, 50);
                drawLine(0, 100, 30, 100);
                
                // Г
                setConsonantStyle();

                float[] dash = { 10, 10 };
                pen = new BasicStroke(
                    5,
                    BasicStroke.CAP_ROUND,
                    BasicStroke.JOIN_ROUND,
                    1,
                    dash,
                0);
                graphics2D.setStroke(pen);

                x1 = 240;
                drawLine(0, 0, 0, 100);
                drawLine(0, 0, 30, 0);
                
                // О
                setVowelStyle();
                x1 = 290;
                drawLine(0, 0, 0, 100);
                drawLine(30, 0, 30, 100);
                drawLine(0, 0, 30, 0);
                drawLine(0, 100, 30, 100);
                drawLine(15, 25, 15, 75);
                
                // Р
                graphics2D.setColor(Color.blue);
                customPen(2);
                x1 = 340;
                drawLine(0, 0, 0, 100);
                drawLine(0, 0, 25, 25);
                drawLine(25, 25, 0, 50);

                // О
                setVowelStyle();
                x1 = 380;
                drawLine(0, 0, 0, 100);
                drawLine(30, 0, 30, 100);
                drawLine(0, 0, 30, 0);
                drawLine(0, 100, 30, 100);
                drawLine(15, 25, 15, 75);
                
                // Д
                setConsonantStyle();
                x1 = 430;
                drawLine(0, 75, 0, 100);
                drawLine(40, 75, 40, 100);
                drawLine(0, 75, 40, 75);

                drawLine(10, 0, 10, 75);
                drawLine(30, 0, 30, 75);
                drawLine(10, 0, 30, 0);
                
                // С
                setConsonantStyle();
                x1 = 490;
                drawLine(0, 0, 0, 100);
                drawLine(0, 0, 30, 0);
                drawLine(0, 100, 30, 100);
                
                // К
                setConsonantStyle();
                x1 = 540;
                drawLine(0, 0, 0, 100);
                drawLine(30, 0, 0, 50);
                drawLine(0, 50, 30, 100);
                
                // И
                setVowelStyle();
                x1 = 590;
                drawLine(0, 0, 0, 100);
                drawLine(30, 0, 30, 100);
                drawLine(30, 0, 0, 100);
                
                // Х
                graphics2D.setColor(Color.BLUE);
                customPen(3);
                x1 = 640;
                drawLine(0, 0, 30, 100);
                drawLine(30, 0, 0, 100);
            }
        }
    }
    
    private void setVowelStyle()
    {
        graphics2D.setColor(customRed);
        customPen(3);
    }
    
    private void setConsonantStyle()
    {
        graphics2D.setColor(Color.BLACK);
        customPen(4);
    }
    
    private void customPen(int width)
    {
        BasicStroke pen = new BasicStroke(
            width,
            BasicStroke.CAP_ROUND,
            BasicStroke.JOIN_ROUND);
        graphics2D.setStroke(pen);
    }
        
    private void drawLine(int dx1, int dy1, int dx2, int dy2)
    {
        graphics2D.drawLine(
                x1 + dx1,
                y1 + dy1,
                x1 + dx2,
                y1 + dy2);
    }
}
