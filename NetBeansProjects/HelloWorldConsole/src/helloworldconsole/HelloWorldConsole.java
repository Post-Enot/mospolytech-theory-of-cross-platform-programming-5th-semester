package helloworldconsole;

import java.util.*;

public class HelloWorldConsole
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in, "Cp866");
        String name;
        
        System.out.println("Как Вас зовут?");
        name = inp.nextLine();
        System.out.println("Добрый день, " + name + "!");
        System.out.println("Сколько Вам лет?");
        int age = inp.nextInt();
        System.out.println(name + ", Вам " + age + " лет!");
    }
}
