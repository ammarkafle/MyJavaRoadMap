package MyJavaTopic.MLT_00_JAVABASIC.JB_11_Arrays.A_02_ArrayOperation.A0_00_1DArrayOperation;

import java.util.Arrays;

public class OneDimentionalArrayOperation {
    public static void main(String[] args) {

        // Create 1D array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 1. Access element
        System.out.println("First Element: " + numbers[0]);

        // 2. Update element
        numbers[1] = 100;
        System.out.println("After Update: " + Arrays.toString(numbers));

        // 3. Find length
        System.out.println("Array Length: " + numbers.length);

        // 4. Traverse array
        System.out.print("Traverse: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 5. Find sum
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum: " + sum);

        // 6. Find average
        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);

        // 7. Find maximum
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum: " + max);

        // 8. Find minimum
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Minimum: " + min);

        // 9. Search element
        int search = 30;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("Element " + search + " found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        // 10. Count even and odd
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);

        // 11. Reverse array display
        System.out.print("Reverse: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // 12. Sort array
        Arrays.sort(numbers);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 13. Copy array
        int[] copy = Arrays.copyOf(numbers, numbers.length);

        System.out.println("Copied Array: " + Arrays.toString(copy));

        // 14. Compare arrays
        boolean equal = Arrays.equals(numbers, copy);

        System.out.println("Arrays Equal: " + equal);

        // 15. Fill array
        int[] newArray = new int[5];

        Arrays.fill(newArray, 10);

        System.out.println("Filled Array: " + Arrays.toString(newArray));
    }

    }

