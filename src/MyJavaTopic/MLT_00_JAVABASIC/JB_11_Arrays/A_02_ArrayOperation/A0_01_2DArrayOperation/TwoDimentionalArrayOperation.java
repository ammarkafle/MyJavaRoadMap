package MyJavaTopic.MLT_00_JAVABASIC.JB_11_Arrays.A_02_ArrayOperation.A0_01_2DArrayOperation;

import java.util.Arrays;

public class TwoDimentionalArrayOperation {
    public static void main(String[] args) {

        // Create 2D array
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // 1. Display 2D array
        System.out.println("Original Array:");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }


        // 2. Access an element
        System.out.println("\nAccess Element: " + numbers[1][2]);


        // 3. Update an element
        numbers[1][2] = 100;

        System.out.println("After Update:");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }


        // 4. Find number of rows
        System.out.println("\nRows: " + numbers.length);


        // 5. Find number of columns
        System.out.println("Columns: " + numbers[0].length);


        // 6. Traverse 2D array
        System.out.print("\nTraverse: ");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }

        System.out.println();


        // 7. Find sum
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                sum = sum + numbers[i][j];
            }
        }

        System.out.println("\nSum: " + sum);


        // 8. Find average
        int totalElements = numbers.length * numbers[0].length;

        double average = (double) sum / totalElements;

        System.out.println("Average: " + average);


        // 9. Find maximum
        int max = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }

        System.out.println("Maximum: " + max);


        // 10. Find minimum
        int min = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
            }
        }

        System.out.println("Minimum: " + min);


        // 11. Search an element
        int search = 50;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] == search) {

                    System.out.println(
                            "Element " + search +
                                    " found at row " + i +
                                    ", column " + j
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }


        // 12. Count even and odd numbers
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        System.out.println("\nEven Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);


        // 13. Count positive and negative numbers
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] > 0) {
                    positive++;
                } else if (numbers[i][j] < 0) {
                    negative++;
                }
            }
        }

        System.out.println("\nPositive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);


        // 14. Row sum
        System.out.println("\nRow Sum:");

        for (int i = 0; i < numbers.length; i++) {

            int rowSum = 0;

            for (int j = 0; j < numbers[i].length; j++) {
                rowSum = rowSum + numbers[i][j];
            }

            System.out.println("Row " + i + " = " + rowSum);
        }


        // 15. Column sum
        System.out.println("\nColumn Sum:");

        for (int j = 0; j < numbers[0].length; j++) {

            int columnSum = 0;

            for (int i = 0; i < numbers.length; i++) {
                columnSum = columnSum + numbers[i][j];
            }

            System.out.println("Column " + j + " = " + columnSum);
        }


        // 16. Main diagonal
        System.out.print("\nMain Diagonal: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][i] + " ");
        }

        System.out.println();


        // 17. Main diagonal sum
        int diagonalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            diagonalSum = diagonalSum + numbers[i][i];
        }

        System.out.println("Main Diagonal Sum: " + diagonalSum);


        // 18. Secondary diagonal
        System.out.print("\nSecondary Diagonal: ");

        int lastColumn = numbers[0].length - 1;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][lastColumn - i] + " ");
        }

        System.out.println();


        // 19. Secondary diagonal sum
        int secondarySum = 0;

        for (int i = 0; i < numbers.length; i++) {
            secondarySum =
                    secondarySum + numbers[i][lastColumn - i];
        }

        System.out.println("Secondary Diagonal Sum: " + secondarySum);


        // 20. Print using Arrays.deepToString()
        System.out.println("\nUsing deepToString:");

        System.out.println(Arrays.deepToString(numbers));


        // 21. Create another 2D array
        int[][] numbers2 = {
                {10, 20, 30},
                {40, 50, 100},
                {70, 80, 90}
        };


        // 22. Compare two 2D arrays
        boolean equal = Arrays.deepEquals(numbers, numbers2);

        System.out.println("\nArrays Equal: " + equal);


        // 23. Copy 2D array
        int[][] copy = new int[numbers.length][];

        for (int i = 0; i < numbers.length; i++) {
            copy[i] = Arrays.copyOf(numbers[i], numbers[i].length);
        }

        System.out.println("Copied Array:");
        System.out.println(Arrays.deepToString(copy));


        // 24. Transpose
        System.out.println("\nTranspose:");

        for (int j = 0; j < numbers[0].length; j++) {

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }


        // 25. Find total number of elements
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            count = count + numbers[i].length;
        }

        System.out.println("Total Elements: " + count);

    }
}
