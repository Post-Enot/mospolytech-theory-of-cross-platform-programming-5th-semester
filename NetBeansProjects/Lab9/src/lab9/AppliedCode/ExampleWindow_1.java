package lab9.AppliedCode;

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class ExampleWindow_1 extends JFrame
{
    private DrawPanel drawPanel = new DrawPanel();
    private final ActionListener actionListener =
        (ActionEvent event) ->
        {
            String actionCommand = event.getActionCommand();
            drawPanel.draw(actionCommand);
        };

    public ExampleWindow_1(String title)
    {
        super(title);
        Box myBox = new Box(BoxLayout.X_AXIS);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        menuBar.add(menu);
        myBox.add(menuBar);

        DrawOption[] drawOptions = DrawOption.values();
        
        for (DrawOption drawOption : drawOptions)
        {
            String strDrawOption = drawOption.toString();
            JMenuItem menuItem = new JMenuItem(strDrawOption);
            menuItem.addActionListener(actionListener);
            menu.add(menuItem);
        }

        myBox.setAlignmentX(CENTER_ALIGNMENT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(myBox, BorderLayout.NORTH);
        add(drawPanel, BorderLayout.CENTER);
        Dimension size = getSize();
        size.setSize(800, 800);
        setMinimumSize(size); 
        pack();
        setVisible(true);
    }
    
    public void TEMP_DrawLastName()
    {
        drawPanel.draw(DrawOption.LAST_NAME.toString());
    }
}
