package lab8.CustomCode;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ChangeEvent;

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
    
    public static final int WHEEL_ROTATION_UP = -1;
    public static final int WHEEL_ROTATION_DOWN = 1;
    public static final int COMBO_BOX_ELEMENT_NUMBER = 12;
    public static final String FRAME_TITLE = "Final frame";
    
    private static ArrayList<JTextField> textFields;
    
    public static void initNotrthLayout(JFrame frame)
    {
        JPanel panel = new JPanel();
        GridLayout gridLayout = new GridLayout(2, 3);
        panel.setLayout(gridLayout);
        
        textFields = new ArrayList<>();
        for (int i = 0; i < 6; i += 1)
        {
            int fieldNumber = i + 1;
            JTextField textField = new JTextField(
                    "Текстовое поле " + fieldNumber);
            textFields.add(textField);
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
        slider.addChangeListener(
            (ChangeEvent event) -> {
                JSlider lSlider = (JSlider)event.getSource();
                int value = lSlider.getValue();
                String strValue = value + "";
                JTextField textField = textFields.get(0);
                textField.setText(strValue);
            }
        );
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
        textArea.addMouseWheelListener(
            (MouseWheelEvent event) -> {
                int wheelRotation = event.getWheelRotation();
                if (wheelRotation == WHEEL_ROTATION_UP)
                {
                    textArea.setText("Вращение вверх");
                }
                else
                {
                    textArea.setText("Вращение вниз");
                }
            }
        );
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
        comboBox.addItemListener(
            (ItemEvent event) -> {
                String item = (String)event.getItem();
                JTextField textField = textFields.get(3);
                textField.setText("Выбран элемент: " + item);
            }
        );
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
