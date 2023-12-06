package helloworldgui;

import javax.swing.*;

public class HelloWorldGUI
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Всем большой привет!");
        String name = JOptionPane.showInputDialog("Привет, как Вас зовут?");
        JOptionPane.showMessageDialog(null, "Приятно познакомиться, \n"+name+"!");
        JOptionPane.showMessageDialog(null, name);
        byte x = 10;
        byte y = 50; 
        x += 1;
        byte z = (byte)(x + y);
        JOptionPane.showMessageDialog(null, z);
    }
}
