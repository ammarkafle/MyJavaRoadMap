package MyProject.Java.MarkSheetProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MarkSheetMain {

    // Calculate total marks
    public static int calculateTotal(int eco, int acc, int eng,
                                     int nep, int math, int computer) {

        return eco + acc + eng + nep + math + computer;
    }

    // Calculate percentage
    public static double calculatePercentage(int total) {

        return (total * 100.0) / 425;
    }

    // Calculate GPA
    public static double calculateGPA(double percentage) {

        return percentage / 25;
    }

    // Calculate grade
    public static String calculateGrade(double percentage) {

        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 70) {
            return "A";
        } else if (percentage >= 60) {
            return "B+";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 40) {
            return "C";
        } else if (percentage >= 30) {
            return "D";
        } else {
            return "F";
        }
    }

    // Calculate division
    public static String calculateDivision(double percentage) {

        if (percentage >= 80) {
            return "Distinction";
        } else if (percentage >= 60) {
            return "First Division";
        } else if (percentage >= 45) {
            return "Second Division";
        } else if (percentage >= 32) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }

    // Check result
    public static boolean isPassed(int eco, int acc, int eng,
                                   int nep, int math, int computer) {

        return eco >= 30 &&
                acc >= 30 &&
                eng >= 30 &&
                nep >= 30 &&
                math >= 30 &&
                computer >= 20;
    }

    // Print marksheet on console
    public static void printMarksheet(
            String name,
            int roll,
            int eco,
            int acc,
            int eng,
            int nep,
            int math,
            int computer) {

        int total = calculateTotal(
                eco, acc, eng, nep, math, computer
        );

        double percentage = calculatePercentage(total);

        double gpa = calculateGPA(percentage);

        String grade = calculateGrade(percentage);

        String division = calculateDivision(percentage);

        boolean passed = isPassed(
                eco, acc, eng, nep, math, computer
        );

        String result;

        if (passed) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        System.out.println();
        System.out.println("              STUDENT MARKSHEET");
        System.out.println("================================================");

        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + roll);

        System.out.printf("%-20s %10s%n", "Subject", "Marks");
        System.out.println("------------------------------------------------");

        System.out.printf("%-20s %10d%n", "Economics", eco);
        System.out.printf("%-20s %10d%n", "Account", acc);
        System.out.printf("%-20s %10d%n", "English", eng);
        System.out.printf("%-20s %10d%n", "Nepali", nep);
        System.out.printf("%-20s %10d%n", "Math", math);
        System.out.printf("%-20s %10d%n", "Computer", computer);

        System.out.println("------------------------------------------------");

        System.out.println("Total Marks : " + total + " / 425");

        System.out.printf(
                "Percentage  : %.2f%%%n",
                percentage
        );

        System.out.printf(
                "GPA         : %.2f%n",
                gpa
        );

        System.out.println("Grade       : " + grade);
        System.out.println("Division    : " + division);
        System.out.println("Result      : " + result);


        System.out.println("              KEEP IT UP!");
        System.out.println("================================================");
    }

    // Save marksheet to file
    public static void saveMarksheet(
            String name,
            int roll,
            int eco,
            int acc,
            int eng,
            int nep,
            int math,
            int computer) {

        int total = calculateTotal(
                eco, acc, eng, nep, math, computer
        );

        double percentage = calculatePercentage(total);

        double gpa = calculateGPA(percentage);

        String grade = calculateGrade(percentage);

        String division = calculateDivision(percentage);

        boolean passed = isPassed(
                eco, acc, eng, nep, math, computer
        );

        String result;

        if (passed) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        String fileName = "MarkSheet_" + roll + ".txt";

        try {

            FileWriter writer = new FileWriter(fileName);


            writer.write("              STUDENT MARKSHEET\n");
            writer.write("================================================\n");

            writer.write("Student Name : " + name + "\n");
            writer.write("Roll Number  : " + roll + "\n");

            writer.write("------------------------------------------------\n");
            writer.write(String.format(
                    "%-20s %10s%n",
                    "Subject",
                    "Marks"
            ));

            writer.write("------------------------------------------------\n");

            writer.write(String.format(
                    "%-20s %10d%n",
                    "Economics",
                    eco
            ));

            writer.write(String.format(
                    "%-20s %10d%n",
                    "Account",
                    acc
            ));

            writer.write(String.format(
                    "%-20s %10d%n",
                    "English",
                    eng
            ));

            writer.write(String.format(
                    "%-20s %10d%n",
                    "Nepali",
                    nep
            ));

            writer.write(String.format(
                    "%-20s %10d%n",
                    "Math",
                    math
            ));

            writer.write(String.format(
                    "%-20s %10d%n",
                    "Computer",
                    computer
            ));

            writer.write("------------------------------------------------\n");

            writer.write(
                    "Total Marks : " + total + " / 425\n"
            );

            writer.write(String.format(
                    "Percentage  : %.2f%%%n",
                    percentage
            ));

            writer.write(String.format(
                    "GPA         : %.2f%n",
                    gpa
            ));

            writer.write("Grade       : " + grade + "\n");
            writer.write("Division    : " + division + "\n");
            writer.write("Result      : " + result + "\n");


            writer.write("              KEEP IT UP!\n");
            writer.write("================================================\n");

            writer.close();

            System.out.println();
            System.out.println("Marksheet saved successfully!");
            System.out.println("File Name: " + fileName);

            File file = new File(fileName);

            System.out.println(
                    "File Location: " + file.getAbsolutePath()
            );

        } catch (IOException e) {

            System.out.println(
                    "Error while saving marksheet."
            );

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("          ADVANCED MARKSHEET SYSTEM");
        System.out.println("================================================");

        // Student information
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.println();
        System.out.println("Enter Marks");
        System.out.println("Maximum marks:");
        System.out.println("Five subjects = 75");
        System.out.println("Computer      = 50");
        System.out.println();

        // Economics
        int eco;

        do {
            System.out.print("Enter Economics marks (0-75): ");
            eco = sc.nextInt();

            if (eco < 0 || eco > 75) {
                System.out.println(
                        "Invalid marks! Enter between 0 and 75."
                );
            }

        } while (eco < 0 || eco > 75);

        // Account
        int acc;

        do {
            System.out.print("Enter Account marks (0-75): ");
            acc = sc.nextInt();

            if (acc < 0 || acc > 75) {
                System.out.println(
                        "Invalid marks! Enter between 0 and 75."
                );
            }

        } while (acc < 0 || acc > 75);

        // English
        int eng;

        do {
            System.out.print("Enter English marks (0-75): ");
            eng = sc.nextInt();

            if (eng < 0 || eng > 75) {
                System.out.println(
                        "Invalid marks! Enter between 0 and 75."
                );
            }

        } while (eng < 0 || eng > 75);

        // Nepali
        int nep;

        do {
            System.out.print("Enter Nepali marks (0-75): ");
            nep = sc.nextInt();

            if (nep < 0 || nep > 75) {
                System.out.println(
                        "Invalid marks! Enter between 0 and 75."
                );
            }

        } while (nep < 0 || nep > 75);

        // Math
        int math;

        do {
            System.out.print("Enter Math marks (0-75): ");
            math = sc.nextInt();

            if (math < 0 || math > 75) {
                System.out.println(
                        "Invalid marks! Enter between 0 and 75."
                );
            }

        } while (math < 0 || math > 75);

        // Computer
        int computer;

        do {
            System.out.print("Enter Computer marks (0-50): ");
            computer = sc.nextInt();

            if (computer < 0 || computer > 50) {
                System.out.println(
                        "Invalid marks! Enter between 0 and 50."
                );
            }

        } while (computer < 0 || computer > 50);

        // Menu
        int choice;

        do {

            System.out.println();
            System.out.println("                  MENU");
            System.out.println("================================================");

            System.out.println("1. Show Complete Marksheet");
            System.out.println("2. Show Total Marks");
            System.out.println("3. Show Percentage");
            System.out.println("4. Show GPA");
            System.out.println("5. Show Grade");
            System.out.println("6. Show Result");
            System.out.println("7. Save Marksheet to File");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    printMarksheet(
                            name,
                            roll,
                            eco,
                            acc,
                            eng,
                            nep,
                            math,
                            computer
                    );

                    break;

                case 2:

                    int total = calculateTotal(
                            eco,
                            acc,
                            eng,
                            nep,
                            math,
                            computer
                    );

                    System.out.println();
                    System.out.println(
                            "Total Marks = " + total + " / 425"
                    );

                    break;

                case 3:

                    int totalForPercentage = calculateTotal(
                            eco,
                            acc,
                            eng,
                            nep,
                            math,
                            computer
                    );

                    double percentage =
                            calculatePercentage(totalForPercentage);

                    System.out.printf(
                            "%nPercentage = %.2f%%%n",
                            percentage
                    );

                    break;

                case 4:

                    int totalForGPA = calculateTotal(
                            eco,
                            acc,
                            eng,
                            nep,
                            math,
                            computer
                    );

                    double percentageForGPA =
                            calculatePercentage(totalForGPA);

                    double gpa =
                            calculateGPA(percentageForGPA);

                    System.out.printf(
                            "%nGPA = %.2f%n",
                            gpa
                    );

                    break;

                case 5:

                    int totalForGrade = calculateTotal(
                            eco,
                            acc,
                            eng,
                            nep,
                            math,
                            computer
                    );

                    double percentageForGrade =
                            calculatePercentage(totalForGrade);

                    String grade =
                            calculateGrade(percentageForGrade);

                    System.out.println(
                            "Grade = " + grade
                    );

                    break;

                case 6:

                    boolean passed = isPassed(
                            eco,
                            acc,
                            eng,
                            nep,
                            math,
                            computer
                    );

                    if (passed) {
                        System.out.println("Result = PASS");
                    } else {
                        System.out.println("Result = FAIL");
                    }

                    break;

                case 7:

                    saveMarksheet(
                            name,
                            roll,
                            eco,
                            acc,
                            eng,
                            nep,
                            math,
                            computer
                    );

                    break;

                case 8:

                    System.out.println();
                    System.out.println(
                            "Program closed. Thank you!"
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid choice! Please try again."
                    );
            }

        } while (choice != 8);

        sc.close();
    }
}
