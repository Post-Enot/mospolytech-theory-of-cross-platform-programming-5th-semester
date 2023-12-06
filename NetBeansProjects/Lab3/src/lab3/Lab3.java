package lab3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Lab3
{
    public static final String TASK1_STRING = "Sweet dreams are made of this";

    public static final String TASK2_STRING =
            "Hey man, look at me rockin' out";
    public static final char TASK2_CHAR = 'o';
    
    public static final String TASK3_STRING = 
            "Old yellow bricks, Love's a risk, Quite the little Escapologist";
    
    public static final int TASK4_DELTA_TIME_SEC = 1_000_000;
    public static final long MS_IN_SEC = 1_000;
        
    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
    }
    
    public static void Task1()
    {
        String str = ReverseString(TASK1_STRING);

        System.out.println("STRING:");
        System.out.println(TASK1_STRING);
        System.out.println();
        System.out.println("REVERSE:");
        System.out.println(str);
        System.out.println();
    }
    
    public static void Task2()
    {
        int count = CountCharInString(TASK2_STRING, TASK2_CHAR);

        System.out.println("STRING:");
        System.out.println(TASK2_STRING);
        System.out.println();
        System.out.println("CHAR:");
        System.out.println(TASK2_CHAR);
        System.out.println();
        System.out.println("OCCURRENCES COUNT: " + count + ".");
    }
    
    public static void Task3()
    {
        String[] words = SplitStringOnWords(TASK3_STRING);

        System.out.println("STRING:");
        System.out.println(TASK3_STRING);
        System.out.println();

        System.out.println("WORDS:");
        for (String word: words)
        {
            System.out.println(word);
        }
        System.out.println();
    }
    
    public static void Task4()
    {
        Date startDate = new Date();
        Date dateAfter1_000_000_Seconds = GetDateAfterN_Seconds(
                startDate,
                TASK4_DELTA_TIME_SEC);
        System.out.println("START DATE:");
        System.out.println(startDate);
        System.out.println();
        System.out.println("DATE AFTER 1 000 000 SECONDS:");
        System.out.println(dateAfter1_000_000_Seconds);
        System.out.println();
    }
    
    public static void Task5()
    {
        Date from = new Date();
        final int SECONDS_COUNT = 100_000_000;
        Date to = GetDateAfterN_Seconds(from, SECONDS_COUNT);
        Date randDate = GetRandomDate(from, to);
        SimpleDateFormat formatter = new SimpleDateFormat(
                "EEEE",
                Locale.ENGLISH);
        String dayOfWeek = formatter.format(randDate);
        
        System.out.println("DATE FROM:");
        System.out.println(from);
        System.out.println();
        System.out.println("DATE TO:");
        System.out.println(to);
        System.out.println();
        System.out.println("RAND DATE:");
        System.out.println(randDate);
        System.out.println();
        System.out.println("DAY OF WEEK:");
        System.out.println(dayOfWeek);
        System.out.println();
    }
    
    public static void Task6()
    {
        Date date = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        String formatedDate = formater.format(date);

        System.out.println("DATE:");
        System.out.println(date);
        System.out.println();
        System.out.println("FORMATED DATE:");
        System.out.println(formatedDate);
        System.out.println();
    }
    
    public static Date GetRandomDate(Date from, Date to)
    {
        long origin = from.getTime();
        long bound = to.getTime() + 1;

        Random rand = CreateRandomSeedCurrentTimeMillis();
        long randTimeMs = rand.nextLong(origin, bound);

        return new Date(randTimeMs);
    }
    
    public static Random CreateRandomSeedCurrentTimeMillis()
    {
        long randSeed = System.currentTimeMillis();
        return new Random(randSeed);
    }
    
    public static long SecToMs(long sec)
    {
        return sec * MS_IN_SEC;
    }
    
    public static Date GetDateAfterN_Seconds(Date date, int seconds)
    {
        long startTimeMs = date.getTime();
        long deltaTimeMs = SecToMs(seconds);
        long timeAfterN_Seconds = startTimeMs + deltaTimeMs;
        return new Date(timeAfterN_Seconds);
    }
    
    public static String[] SplitStringOnWords(String string)
    {
        return string.split(" ");
    }
    
    public static int CountCharInString(String string, char sample)
    {
        int count = 0;
        for (int i = 0; i < string.length(); i += 1)
        {
            char ch = string.charAt(i);
            if (ch == sample)
            {
                count += 1;
            }
        }
        return count;
    }
    
    public static String ReverseString(String string)
    {
        StringBuilder stringBuilder = new StringBuilder();
        
        int lastIndex = string.length() - 1;
        for (int i = lastIndex; i >= 0; i -= 1)
        {
            char ch = string.charAt(i);
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
