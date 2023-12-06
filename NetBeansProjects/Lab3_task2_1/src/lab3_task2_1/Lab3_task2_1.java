package lab3_task2_1;

import java.util.Random;

public class Lab3_task2_1
{
    public static final int TASK2_1_MATRIX_WIDTH = 10;
    public static final int TASK2_1_MATRIX_HEIGHT = 10;
    public static final int TASK2_1_RAND_INT_ORIGIN = 100;
    public static final int TASK2_1_RAND_INT_BOUND = 1_000;

    public static void main(String[] args)
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
        OutArray(evenElements, "EVEN ELEMENTS");
        OutArray(oddElements, "ODD ELEMENETS");
    }
    
    public static boolean IsEven(int number)
    {
        return (number % 2) == 0;
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
    
    public static void FillMatrixRand(
            Random rand,
            int[][] matrix,
            int origin,
            int bound)
    {
        for (int y = 0; y < matrix.length; y += 1)
        {
            int[] row = matrix[y];
            FillArrayRand(rand, row, origin, bound);
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
    
    public static void OutMatrixAsArray(int[][] matrix)
    {
        System.out.println("MATRIX:");
        for (int y = 0; y < matrix.length; y += 1)
        {
            for (int x = 0; x < matrix[y].length; x += 1)
            {
                int element = matrix[y][x];
                System.out.println("[" + x + "; " + y + "] " + element + ";");
            }
        }
        System.out.println();
    }
}
