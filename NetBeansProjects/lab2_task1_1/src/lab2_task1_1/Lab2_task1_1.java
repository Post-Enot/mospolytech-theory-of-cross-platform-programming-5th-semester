package lab2_task1_1;

import java.util.Random;

public class Lab2_task1_1
{
    public static final int TASK1_1_ARRAY_SIZE = 100;
    public static final int TASK1_1_RAND_INT_ORIGIN = 0;
    public static final int TASK1_1_RAND_INT_BOUND = 1_001;

    public static void main(String[] args)
    {
        int[] array = CreateRandFillArray(
                TASK1_1_ARRAY_SIZE,
              TASK1_1_RAND_INT_ORIGIN,
               TASK1_1_RAND_INT_BOUND);
        
        int[] indexes = GetIndexesOfElementMultiple3And5(array);
        
        OutArray(array, "ARRAY:");
        OutFoundElements(array, indexes);
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
    
    public static boolean IsMultiple(int a, int b)
    {
        return (a % b) == 0;
    }
    
    public static boolean IsMultiple3And5(int number)
    {
        return IsMultiple(number, 3) && IsMultiple(number, 5);
    }
    
    public static int CountElementsMultiple3And5(int[] array)
    {
        int count = 0;
        for (int element: array)
        {
            if (IsMultiple3And5(element))
            {
                count += 1;
            }
        }
        return count;
    }
    
    public static int[] GetIndexesOfElementMultiple3And5(int[] array)
    {
        int indexCount = CountElementsMultiple3And5(array);        
        int[] indexes = new int[indexCount];
        int indexesHeader = 0;

        for (int i = 0; i < array.length; i += 1)
        {
            int element = array[i];
            if (IsMultiple3And5(element))
            {
                indexes[indexesHeader] = i;
                indexesHeader += 1;
            }
        }
        return indexes;
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
    
    public static void OutFoundElements(int[] array, int[] indexes)
    {
        System.out.println("FOUND ELEMENTS:");

        int penultimateIndex = indexes.length - 1;
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
