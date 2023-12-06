package lab2_task1_2;

import java.util.Random;

public class Lab2_task1_2
{
    public static final int TASK1_2_K = 500;
    public static final int TASK1_2_ARRAY_SIZE = 100;
    public static final int TASK1_2_RAND_INT_ORIGIN = 0;
    public static final int TASK1_2_RAND_INT_BOUND = 1_001;
    
    public static void main(String[] args)
    {
        int[] array = CreateRandFillArray(
                TASK1_2_ARRAY_SIZE,
              TASK1_2_RAND_INT_ORIGIN,
               TASK1_2_RAND_INT_BOUND);

        int lessCounter = 0;
        int moreCounter = 0;
        int equalCounter = 0;
        
        for (int element: array)
        {
            if (element < TASK1_2_K)
            {
                lessCounter += 1;
            }
            else if (element > TASK1_2_K)
            {
                moreCounter += 1;
            }
            else
            {
                equalCounter += 1;
            }
        }
        OutArray(array, "ARRAY:");
        
        System.out.println("K = " + TASK1_2_K + ";");
        System.out.println("Less then K: " + lessCounter + ";");
        System.out.println("More then K: " + moreCounter + ";");
        System.out.println("Equal to K: " + equalCounter + ".");
    }
    
    public static Random CreateRandomSeedCurrentTimeMillis()
    {
        long randSeed = System.currentTimeMillis();
        return new Random(randSeed);
    }
    
    public static void FillArrayRand(
            Random rand,
            int[] array,
            int origin,
            int bound)
    {
        for (int i = 0; i < array.length; i += 1)
        {
            array[i] = rand.nextInt(origin, bound);
        }
    }
    
    public static int[] CreateRandFillArray(
            int size,
            int origin,
            int bound)
    {
        Random rand = CreateRandomSeedCurrentTimeMillis();
        int[] array = new int[size];
        FillArrayRand(rand, array, origin, bound);
        return array;
    }
    
    public static void OutFirstOrMiddleArrayElement(int index, int value)
    {
        System.out.println(index + ": " + value + ";");
    }
    
    public static void OutLastArrayElement(int index, int value)
    {
        System.out.println(index + ": " + value + ".");
    }
    
    public static void OutArray(int[] array, String header)
    {
        System.out.println(header);

        int penultimateIndex = array.length - 1;
        for (int i = 0; i < penultimateIndex; i += 1)
        {
            int value = array[i];
            OutFirstOrMiddleArrayElement(i, value);
        }

        int lastIndex = array.length - 1;
        int lastValue = array[lastIndex];
        OutLastArrayElement(lastIndex, lastValue);
        
        System.out.println();
    }
}
