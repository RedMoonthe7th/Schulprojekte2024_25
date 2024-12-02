package DataGenerator;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        Random random = new Random();
        int[] data = new int [size];

        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }

    public static int[] generateDataArrayMinMax(int size, int min, int max) {
        Random random = new Random();
        int[] data = new int [size];

        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }

    public void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}