 // 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы


public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[] { 5, 56, 4, 98, 56, 1 };
        int max = getMax(array);
        System.out.println("Максимальное число в массиве: " + max);

        int min = getMin(array);
        System.out.println("Минимальное число в массиве: " + min);
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    
}


