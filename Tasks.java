package HomeTasks;

import java.util.Arrays;

public class Tasks {
    //1. Подсчет среднего значения элементов массива:
    static double calculateAverage(int[] numbers) {
        double summary = 0;
        for (int number : numbers) {
            summary += number;
        }
        return summary / numbers.length;
    }
    //2. Поиск максимального элемента в массиве:

    static int findMax(int[] numbers) {
        int N = numbers.length;
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    //3. Переворот массива:
    static void reverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }
//    4. Проверка наличия элемента в массиве:

    static boolean contains(int[] numbers, int element) {
        for (int number : numbers)
            if (number == element) return true;
            else {
                return false;
            }
        return false;
    }

    //    5. Конкатенация двух массивов:
    static int[] concatenateArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] result = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            result[i] = array1[i];
        }

        for (int i = 0; i < length2; i++) {
            result[length1 + i] = array2[i];
        }

        return result;
    }

    //  6.Удаление дубликатов из массива:
//    static int[] removeDuplicates(int[] numbers) {
//        Arrays.sort(numbers);
//        int count = 1;
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] != numbers[i - 1]) {
//                numbers[count] = numbers[i];
//                count++;
//            }
//        }
//????????????????????????????????????????????
//    }


    //
//    7. Проверка массива на симметричность:
    static boolean isSymmetric(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    //    8. Замена отрицательных элементов массива на их модули:
    static void replaceNegativesWithAbs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = -numbers[i];
            }
        }
    }

    //    9. Разделение положительных и отрицательных элементов массива:
    static int[] separatePositivesAndNegatives(int[] numbers) {
        int[] separatedArray = new int[numbers.length];
        int positiveIndex = 0;
        int negativeIndex = numbers.length - 1;

        for (int number : numbers) {
            if (number >= 0) {
                separatedArray[positiveIndex] = number;
                positiveIndex++;
            } else {
                separatedArray[negativeIndex] = number;
                negativeIndex--;
            }
        }

        return separatedArray;
    }


    //10. Подсчет количества простых чисел в массив
    public static int countPrimes(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (isPrime(number)) {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //    11. Поиск наибольшего общего делителя двух чисел:
    static int findGCD(int a, int b) {

        if (a == 0) return b;
        int r = a % b;
        return findGCD(b, r);
    }
}










