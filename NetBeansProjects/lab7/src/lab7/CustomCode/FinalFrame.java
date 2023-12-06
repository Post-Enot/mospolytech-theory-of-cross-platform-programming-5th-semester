package lab7.CustomCode;

import java.awt.*;
import javax.swing.*;

public class FinalFrame
{
    public FinalFrame()
    {
        JFrame frame = new JFrame(FinalFrame.FRAME_TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1270, 720);
        initNotrthLayout(frame);
        initSouthLayout(frame);
        initWestLayout(frame);
        initEastLayout(frame);
        initCenterLayout(frame);
        frame.setVisible(true);
        frame.pack();
        Dimension currentSize = frame.getSize();
        frame.setMinimumSize(currentSize);
    }
    
    public static final int COMBO_BOX_ELEMENT_NUMBER = 12;
    public static final String FRAME_TITLE = "Final frame";
    
    public static void initNotrthLayout(JFrame frame)
    {
        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(2, 3);
        panel.setLayout(gridLayout);
        
        for (int i = 0; i < 6; i += 1)
        {
            int fieldNumber = i + 1;
            JTextField textField = new JTextField(
                    "Текстовое поле " + fieldNumber);
            panel.add(textField);
        }
        
        frame.add(panel, BorderLayout.NORTH);
    }
    
    public static void initSouthLayout(JFrame frame)
    {
        JPanel panel = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        panel.setLayout(borderLayout);
        JSlider slider = new JSlider(0, 100, 25);
        panel.add(slider);
        frame.add(panel, BorderLayout.SOUTH);
    }
    
    public static void initWestLayout(JFrame frame)
    {
        Box box = new Box(BoxLayout.Y_AXIS);
        for (int i = 1; i <= 9; i += 1)
        {
            String checkboxLabel = "Выбор " + i;
            Checkbox checkbox = new Checkbox(checkboxLabel);
            box.add(checkbox);
        }
        frame.add(box, BorderLayout.WEST);
    }
    
    public static void initEastLayout(JFrame frame)
    {
        JTextArea textArea = new JTextArea(
                "Текстовая область",
                20,
                30);
        frame.add(textArea, BorderLayout.EAST);
    }
    
    public static void initCenterLayout(JFrame frame)
    {
        JPanel panel = new JPanel();
        FlowLayout flowLayout = new FlowLayout();
        panel.setLayout(flowLayout);
        String[] listValues = new String[COMBO_BOX_ELEMENT_NUMBER];
        for (int i = 0; i < COMBO_BOX_ELEMENT_NUMBER; i += 1)
        {
            listValues[i] = i + "";
        }
        JComboBox comboBox = new JComboBox(listValues);
        comboBox.setSelectedIndex(11);
        panel.add(comboBox);
        JSpinner spinner = new JSpinner();
        panel.add(spinner);
        JRadioButton radioButton = new JRadioButton("Радиокнопка 1");
        panel.add(radioButton);
        radioButton = new JRadioButton("Радиокнопка 2");
        panel.add(radioButton);
        
        frame.add(panel, BorderLayout.CENTER);
    }
}
