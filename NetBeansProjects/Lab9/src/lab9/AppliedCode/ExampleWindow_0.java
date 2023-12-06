package lab9.AppliedCode;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class ExampleWindow_0 extends JFrame
{
    private JTextField myText;
    private final ActionListener actionListener = (ActionEvent event) ->
    {
        String actionCommand = event.getActionCommand();
        myText.setText(actionCommand);
    };

    public ExampleWindow_0(String name)
    {
        super(name);
        JMenuBar myMenuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Пункт1");
        JMenu first = new JMenu("Пункт1_1");
        menu1.add(first);
        JMenuItem[] first_1 = new JMenuItem[3];
        for (int i = 0; i < 3; i += 1)
        {
            first_1[i]=new JMenuItem("Пункт1_1_"+(i+1)); 
            first.add(first_1[i]); 
            first_1[i].addActionListener(actionListener);
        }
        JMenu second=new JMenu("Пункт1_2");
        menu1.add(second);
        JMenuItem[] second_1=new JMenuItem[3];
        for (int i=0;i<3;i++)
        {
            second_1[i]=new JMenuItem("Пункт1_2_"+(i+1));
            second.add(second_1[i]);
            second_1[i].addActionListener(actionListener);
        }
        JMenu menu2=new JMenu("Пункт2");
        JMenu first2=new JMenu("Пункт2_1"); 
        menu2.add(first2); 
        JMenuItem[] first2_1=new JMenuItem[3]; 
        for (int i = 0; i < 3; i += 1)
        {
            first2_1[i]=new JMenuItem("Пункт2_1_"+(i+1));
            first2.add(first2_1[i]);
            first2_1[i].addActionListener(actionListener);
        }
        JMenu second2=new JMenu("Пункт2_2");
        menu2.add(second2);
        JMenuItem[] second2_1=new JMenuItem[3];
        for (int i=0;i<3;i++)
        {
            second2_1[i]=new JMenuItem("Пункт2_2_"+(i+1));
            second2.add(second2_1[i]);
            second2_1[i].addActionListener(actionListener);
        }
        myMenuBar.add(menu1);
        myMenuBar.add(menu2);
        myText = new JTextField();
        setJMenuBar(myMenuBar); //устанавливаем для окна созданное меню 
        add(myText,BorderLayout.SOUTH); 
        setSize(300, 200); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
