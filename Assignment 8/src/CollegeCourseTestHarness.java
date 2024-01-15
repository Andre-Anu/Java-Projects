import java.util.Random;

public class CollegeCourseTestHarness {
    public static void main(String[] args) {
        CollegeCourse[][] courseArray = new CollegeCourse[200][10];

        // Fill the first 100 rows with CollegeCourse objects with default values
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                courseArray[i][j] = new CollegeCourse();
            }
        }

        // Fill the second 100 rows with CollegeCourse objects with custom default values
        for (int i = 100; i < 200; i++) {
            for (int j = 0; j < 10; j++) {
                courseArray[i][j] = new CollegeCourse(9999, 9999);
            }
        }

        // Print the state of each object with a dashed line between each data set
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 10; j++) {
                CollegeCourse course = courseArray[i][j];
                System.out.println("Course[" + i + "][" + j + "]: " +
                        "Reference Number: " + course.getCourseReferenceNumber() +
                        ", Course Number: " + course.getCourseNumber());
            }
            System.out.println("--------------------");
        }

        // Set the state of each object with sequential/unique 7-digit reference number and random 5-digit course number
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 10; j++) {
                CollegeCourse course = courseArray[i][j];
                int referenceNumber = i * 10 + j + 1; // Generating unique 7-digit reference number
                int[] courseNumbers = {10001, 10002, 10003, 10004};
                int randomCourseNumber = courseNumbers[random.nextInt(courseNumbers.length)];
                course.setCourseReferenceNumber(referenceNumber);
                course.setCourseNumber(randomCourseNumber);
            }
        }

        // Print the state of each object with a dashed line between each data set
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 10; j++) {
                CollegeCourse course = courseArray[i][j];
                System.out.println("Course[" + i + "][" + j + "]: " +
                        "Reference Number: " + course.getCourseReferenceNumber() +
                        ", Course Number: " + course.getCourseNumber());
            }
            System.out.println("--------------------");
        }

        // Ask the user for a column and row number
        int row, col;
        try {
            // Read row and column numbers from the user
            // (Make sure to implement the code for reading input from the user, not included in this code snippet)
            row = 0; // Replace with user input
            col = 0; // Replace with user input

            // Print the state of the object corresponding to the user's input
            CollegeCourse course = courseArray[row][col];
            System.out.println("Course[" + row + "][" + col + "]: " +
                    "Reference Number: " + course.getCourseReferenceNumber() +
                    ", Course Number: " + course.getCourseNumber());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid row or column number. Please provide valid numbers.");
        }
    }
}
