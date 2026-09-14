package MyJavaTopic.MLT_00_JAVABASIC.JB_11_Arrays.A_03_ArrayClass.AC_00_1DArrayClass;

import java.util.Arrays;

public class OneDimentionalArrayClass {
    public static void main(String[] args) {

        // 1D array
        int[] numbers = {50, 20, 40, 10, 30};

        // 1. toString()
        System.out.println("1. toString: " + Arrays.toString(numbers));

        // 2. sort()
        Arrays.sort(numbers);
        System.out.println("2. sort: " + Arrays.toString(numbers));

        // 3. binarySearch()
        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("3. binarySearch: " + index);

        // 4. copyOf()
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("4. copyOf: " + Arrays.toString(copy));

        // 5. copyOf() with bigger size
        int[] biggerCopy = Arrays.copyOf(numbers, 7);
        System.out.println("5. copyOf bigger: " + Arrays.toString(biggerCopy));

        // 6. copyOfRange()
        int[] range = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("6. copyOfRange: " + Arrays.toString(range));

        // 7. equals()
        int[] another = {10, 20, 30, 40, 50};
        System.out.println("7. equals: " + Arrays.equals(numbers, another));

        // 8. fill()
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 100);
        System.out.println("8. fill: " + Arrays.toString(fillArray));

        // 9. fill() with range
        int[] rangeFill = {1, 2, 3, 4, 5};
        Arrays.fill(rangeFill, 1, 4, 9);
        System.out.println("9. fill range: " + Arrays.toString(rangeFill));

        // 10. compare()
        int[] a = {10, 20, 30};
        int[] b = {10, 20, 40};

        System.out.println("10. compare: " + Arrays.compare(a, b));

        // 11. mismatch()
        System.out.println("11. mismatch: " + Arrays.mismatch(a, b));

        // 12. hashCode()
        System.out.println("12. hashCode: " + Arrays.hashCode(numbers));


        // =========================
        // 2D ARRAY OPERATIONS
        // =========================

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // 13. deepToString()
        System.out.println("13. deepToString: " +
                Arrays.deepToString(matrix));

        // 14. deepEquals()
        System.out.println("14. deepEquals: " +
                Arrays.deepEquals(matrix, matrix2));

        // 15. deepHashCode()
        System.out.println("15. deepHashCode: " +
                Arrays.deepHashCode(matrix));

    }
}
