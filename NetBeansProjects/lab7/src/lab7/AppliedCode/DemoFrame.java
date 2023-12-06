package lab7.AppliedCode;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class DemoFrame
{
    public DemoFrame()
    {
        JFrame frame = new JFrame(DemoFrame.FRAME_TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        initNorthLayout(frame);
        initSouthLayout(frame);
        initWestLayout(frame);
        initEastLayout(frame);
        initCenterLayout(frame);
        frame.setVisible(true);
        frame.pack();
        Dimension currentSize = frame.getSize();
        frame.setMinimumSize(currentSize);
    }
    
    public static final String FRAME_TITLE = "Frame demo";
    public static final String BUTTON_HTML =
            """
            <html>
                <b>
                    <font color="red" size=14>
                        Кнопка 2
                    </font>
                </b>
            </html>
            """;
    
    public static void initNorthLayout(JFrame frame)
    {
        JPanel panel = new JPanel();
        FlowLayout flowLayout = new FlowLayout();
        panel.setLayout(flowLayout);
        panel.add(new JButton("Кнопка 1"));
        JButton button = new JButton(DemoFrame.BUTTON_HTML);
        Component horizontalStrut = Box.createHorizontalStrut(40);
        panel.add(horizontalStrut);
        panel.add(button);
        frame.add(panel, BorderLayout.NORTH);
    }
    
    public static void initSouthLayout(JFrame frame)
    {
        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.SOUTH);
    }

    public static void initWestLayout(JFrame frame)
    {
        Box box = new Box(BoxLayout.Y_AXIS);
        Component component = Box.createVerticalStrut(20);
        box.add(component);
        JLabel label = new JLabel("Метка 1");
        box.add(label);
        component = Box.createVerticalGlue();
        box.add(component);
        label = new JLabel("Метка 2");
        box.add(label);
        component = Box.createVerticalGlue();
        box.add(component);
        JCheckBox checkBox = new JCheckBox("Выбор");
        box.add(checkBox);
        component = Box.createVerticalStrut(20);
        box.add(component);
        frame.add(box, BorderLayout.WEST);
    }
    
    public static void initEastLayout(JFrame frame)
    {        
        ButtonGroup buttonGroup = new ButtonGroup();
        JPanel panel = new JPanel();
        ArrayList<JRadioButton> radioButtons = new ArrayList<>();
        GridLayout gridLayout = new GridLayout(3, 2);
        panel.setLayout(gridLayout);
        for (int i = 0; i < 6; i += 1)
        {
            JRadioButton radioButton = new JRadioButton("Выбор " + i);
            radioButtons.add(radioButton);
            buttonGroup.add(radioButton);
            panel.add(radioButton);
        }
        JRadioButton radioButton = radioButtons.getFirst();
        radioButton.setSelected(true);
        frame.add(panel, BorderLayout.EAST);
    }

    public static void initCenterLayout(JFrame frame)
    {
        JTextArea textArea = new JTextArea();
        frame.add(textArea, BorderLayout.CENTER);
    }
}
