package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lab2
{
    public static final int TASK1_1_ARRAY_SIZE = 100;
    public static final int TASK1_1_RAND_INT_ORIGIN = 0;
    public static final int TASK1_1_RAND_INT_BOUND = 1_001;
    
    public static final int TASK1_2_K = 500;
    public static final int TASK1_2_ARRAY_SIZE = 100;
    public static final int TASK1_2_RAND_INT_ORIGIN = 0;
    public static final int TASK1_2_RAND_INT_BOUND = 1_001;
    
    public static final int TASK2_1_MATRIX_WIDTH = 10;
    public static final int TASK2_1_MATRIX_HEIGHT = 10;
    public static final int TASK2_1_RAND_INT_ORIGIN = 100;
    public static final int TASK2_1_RAND_INT_BOUND = 1_000;
    
    public static final int TASK2_2_MATRIX_WIDTH = 10;
    public static final int TASK2_2_MATRIX_HEIGHT = 20;
    public static final int TASK2_2_RAND_INT_ORIGIN = 100;
    public static final int TASK2_2_RAND_INT_BOUND = 1_000;
    
    public static void main(String[] args)
    {
        Task1_1();
        Task1_2();
        Task2_1();
        Task2_2();
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
    
    public static void FillMatrixRand(
            Random rand,
            int[][] matrix,
            int origin,
            int bound)
    {
        for (int y = 0; y < matrix.length; y += 1)
        {
            int[] array = matrix[y];
            FillArrayRand(rand, array, origin, bound);
        }
    }
    
    public static int[][] CreateRandFillMatrix(
            int width,
            int height,
            int origin,
            int bound)
    {
        Random rand = CreateRandomSeedCurrentTimeMillis();
        int[][] matrix = new int[height][width];
        FillMatrixRand(rand, matrix, origin, bound);

        return matrix;
    }
    
    public static void OutArray(int[] array, String header)
    {
        System.out.println(header + ":");
        for (int i = 0; i < array.length; i += 1)
        {
            int element = array[i];
            System.out.println(i + ": " + element + ";");
        }
    }
    
    public static void OutArray(int[] array)
    {
        final String DEFAULT_HEADER = "Array";
        OutArray(array, DEFAULT_HEADER);
    }
    
    public static void OutMatrixAsArray(int[][] matrix)
    {
        System.out.println("Matrix elements:");
        for (int y = 0; y < matrix.length; y += 1)
        {
            for (int x = 0; x < matrix[y].length; x += 1)
            {
                int element = matrix[y][x];
                System.out.println("[" + x + "; " + y + "] " + element + ";");
            }
        }
    }
    
    public static void Task1_1()
    {
        int[] array = CreateRandFillArray(
                TASK1_1_ARRAY_SIZE,
                TASK1_1_RAND_INT_ORIGIN,
                TASK1_1_RAND_INT_BOUND);

        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < array.length; i += 1)
        {
            int element = array[i];
            if (((element % 5) == 0) && ((element % 3) == 0))
            {
                indexes.add(i);
            }
        }
        
        OutArray(array);
        
        System.out.println("\nFound elements:");
        for (int j = 0; j < indexes.size(); j += 1)
        {
            int i = indexes.get(j);
            int element = array[i];
            System.out.println("i: " + i + ": " + element + ";");
        }
    }
    
    public static void Task1_2()
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
        OutArray(array);
        
        System.out.println();
        System.out.println("K = " + TASK1_2_K + ";");
        System.out.println("Less then K: " + lessCounter);
        System.out.println("More then K: " + moreCounter);
        System.out.println("Equal to K: " + equalCounter);
    }
    
    public static boolean IsEven(int number)
    {
        return (number % 2) == 0;
    }
    
    public static int ArrayAmount(int[] array)
    {
        int amount = 0;
        for (int i = 0; i < array.length; i += 1)
        {
            int element = array[i];
            amount += element;
        }
        return amount;
    }
        
    public static void Task2_1()
    {
        int[][] matrix = CreateRandFillMatrix(
                TASK2_1_MATRIX_WIDTH,
                TASK2_1_MATRIX_HEIGHT,
                TASK2_1_RAND_INT_ORIGIN,
                TASK2_1_RAND_INT_BOUND);

        int evenCount = 0;
        int oddCount = 0;
        
        for (int y = 0; y < matrix.length; y += 1)
        {
            for (int x = 0; x < matrix[y].length; x += 1)
            {
                int element = matrix[y][x];

                if (IsEven(element))
                {
                    evenCount += 1;
                }
                else
                {
                    oddCount += 1;
                }
            }
        }
        
        int[] evenElements = new int[evenCount];
        int[] oddElements = new int[oddCount];
        
        int evenHeader = 0;
        int OddHeader = 0;
        
        for (int y = 0; y < matrix.length; y += 1)
        {
            for (int x = 0; x < matrix[y].length; x += 1)
            {
                int element = matrix[y][x];

                if (IsEven(element))
                {
                    evenElements[evenHeader] = element;
                    evenHeader += 1;
                }
                else
                {
                    oddElements[OddHeader] = element;
                    OddHeader += 1;
                }
            }
        }
        
        OutMatrixAsArray(matrix);
        OutArray(evenElements, "Even elements");
        OutArray(oddElements, "Odd elements");
    }
    
    public static void Task2_2()
    {
        int[][] matrix = CreateRandFillMatrix(
                TASK2_2_MATRIX_WIDTH,
               TASK2_2_MATRIX_HEIGHT,
               TASK2_2_RAND_INT_ORIGIN, 
                TASK2_2_RAND_INT_BOUND);
        
        int largestColumnAmountIndex = 0;
        int largestColumnAmount = 0;
        
        int smallestColumnAmountIndex = 0;
        int smallestColumnAmount = Integer.MAX_VALUE;

        for (int x = 0; x < TASK2_2_MATRIX_WIDTH; x += 1)
        {
            int columnAmount = 0;
            for (int y = 0; y < matrix.length; y += 1)
            {
                columnAmount += matrix[y][x];
            }
            
            if (columnAmount > largestColumnAmount)
            {
                largestColumnAmount = columnAmount;
                largestColumnAmountIndex = x;
            }
            else if (columnAmount < smallestColumnAmount)
            {
                smallestColumnAmount = columnAmount;
                smallestColumnAmountIndex = x;
            }
        }
        
        System.out.println("Column with smallest amount:");
        for (int y = 0; y < matrix.length; y += 1)
        {
            int element = matrix[y][smallestColumnAmountIndex];
            System.out.println("[" + smallestColumnAmountIndex + "; " +
                    y + "] " + element + ";");
        }
        System.out.println("Amount = " + smallestColumnAmount);

        System.out.println("Column with largest amount:");
        for (int y = 0; y < matrix.length; y += 1)
        {
            int element = matrix[y][largestColumnAmountIndex];
            System.out.println("[" + largestColumnAmountIndex + "; " +
                    y + "] " + element + ";");
        }
        System.out.println("Amount = " + largestColumnAmount);
    }
}
