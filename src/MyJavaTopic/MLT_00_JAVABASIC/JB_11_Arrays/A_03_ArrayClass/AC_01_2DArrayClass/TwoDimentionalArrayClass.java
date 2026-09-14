package MyJavaTopic.MLT_00_JAVABASIC.JB_11_Arrays.A_03_ArrayClass.AC_01_2DArrayClass;

import java.util.Arrays;

public class TwoDimentionalArrayClass {
    public static void main(String[] args) {

// Create 2D arrays
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int[][] numbers2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };


        // 1. Print complete 2D array
        System.out.println("1. deepToString:");
        System.out.println(Arrays.deepToString(numbers));


        // 2. Compare two 2D arrays
        System.out.println("\n2. deepEquals:");
        System.out.println(Arrays.deepEquals(numbers, numbers2));


        // 3. Deep hash code
        System.out.println("\n3. deepHashCode:");
        System.out.println(Arrays.deepHashCode(numbers));


        // 4. Copy a row using copyOf()
        int[] rowCopy = Arrays.copyOf(numbers[0], numbers[0].length);

        System.out.println("\n4. copyOf row:");
        System.out.println(Arrays.toString(rowCopy));


        // 5. Copy part of a row using copyOfRange()
        int[] rangeCopy = Arrays.copyOfRange(numbers[0], 1, 3);

        System.out.println("\n5. copyOfRange row:");
        System.out.println(Arrays.toString(rangeCopy));


        // 6. Compare two rows using equals()
        System.out.println("\n6. equals row:");
        System.out.println(Arrays.equals(numbers[0], numbers2[0]));


        // 7. Sort one row
        int[][] sortArray = {
                {30, 10, 20},
                {60, 40, 50},
                {90, 70, 80}
        };

        Arrays.sort(sortArray[0]);

        System.out.println("\n7. sort row:");
        System.out.println(Arrays.deepToString(sortArray));


        // 8. Fill one row
        int[][] fillArray = {
                {1, 2, 3},
                {4, 5, 6}
        };

        Arrays.fill(fillArray[0], 100);

        System.out.println("\n8. fill row:");
        System.out.println(Arrays.deepToString(fillArray));


        // 9. Access element
        System.out.println("\n9. Access:");
        System.out.println(numbers[1][2]);


        // 10. Update element
        numbers[1][2] = 100;

        System.out.println("\n10. Update:");
        System.out.println(Arrays.deepToString(numbers));


        // 11. Number of rows
        System.out.println("\n11. Number of rows:");
        System.out.println(numbers.length);


        // 12. Number of columns in first row
        System.out.println("\n12. Number of columns:");
        System.out.println(numbers[0].length);


        // 13. Traverse 2D array
        System.out.println("\n13. Traverse:");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }


        // 14. Row sum
        System.out.println("\n14. Row sum:");

        for (int i = 0; i < numbers.length; i++) {

            int sum = 0;

            for (int j = 0; j < numbers[i].length; j++) {
                sum = sum + numbers[i][j];
            }

            System.out.println("Row " + i + " = " + sum);
        }


        // 15. Column sum
        System.out.println("\n15. Column sum:");

        for (int j = 0; j < numbers[0].length; j++) {

            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i][j];
            }

            System.out.println("Column " + j + " = " + sum);
        }


        // 16. Total sum
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                total = total + numbers[i][j];
            }
        }

        System.out.println("\n16. Total sum:");
        System.out.println(total);


        // 17. Average
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                count++;
            }
        }

        double average = (double) total / count;

        System.out.println("\n17. Average:");
        System.out.println(average);


        // 18. Maximum
        int max = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }

        System.out.println("\n18. Maximum:");
        System.out.println(max);


        // 19. Minimum
        int min = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
            }
        }

        System.out.println("\n19. Minimum:");
        System.out.println(min);


        // 20. Search element
        int search = 50;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] == search) {
                    found = true;
                    System.out.println("\n20. Search:");
                    System.out.println("Found at [" + i + "][" + j + "]");
                }
            }
        }

        if (!found) {
            System.out.println("\n20. Search:");
            System.out.println("Not found");
        }


        // 21. Count even numbers
        int even = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] % 2 == 0) {
                    even++;
                }
            }
        }

        System.out.println("\n21. Even count:");
        System.out.println(even);


        // 22. Count odd numbers
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] % 2 != 0) {
                    odd++;
                }
            }
        }

        System.out.println("\n22. Odd count:");
        System.out.println(odd);


        // 23. Main diagonal
        System.out.println("\n23. Main diagonal:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][i] + " ");
        }


        // 24. Main diagonal sum
        int diagonalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            diagonalSum = diagonalSum + numbers[i][i];
        }

        System.out.println("\n\n24. Main diagonal sum:");
        System.out.println(diagonalSum);


        // 25. Secondary diagonal
        System.out.println("\n25. Secondary diagonal:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][numbers.length - 1 - i] + " ");
        }


        // 26. Secondary diagonal sum
        int secondarySum = 0;

        for (int i = 0; i < numbers.length; i++) {
            secondarySum =
                    secondarySum + numbers[i][numbers.length - 1 - i];
        }

        System.out.println("\n\n26. Secondary diagonal sum:");
        System.out.println(secondarySum);


        // 27. Transpose
        System.out.println("\n27. Transpose:");

        for (int j = 0; j < numbers[0].length; j++) {

            for (int i = 0; i < numbers.length; i++) {

                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }

    }
}
