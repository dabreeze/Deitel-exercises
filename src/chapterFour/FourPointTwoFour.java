package chapterFour;

import java.util.Scanner;

public class FourPointTwoFour {
        public static void main(String[] args) {
// create Scanner to obtain input from command window
            Scanner input = new Scanner(System.in);
// initializing variables in declarations
            int passes = 0;
            int failures = 0;
            int studentCounter = 1;
            int result;
// process 10 students using counter-controlled loop
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            result = input.nextInt();

            while (studentCounter <= 10) {

                while (result > 2 || result <= 0) {
                System.out.println("please enter valid numbers 1 or 2");
                result = input.nextInt();
            }
// prompt user for input and obtain value from user
                System.out.print("Enter result (1 = pass, 2 = fail): ");
                result = input.nextInt();

                    if (result == 1) {
                        passes = passes + 1;
                    } else {
                        failures = failures + 1;
                    }
// increment studentCounter so loop eventually terminates
                    studentCounter = studentCounter + 1;

            }
// termination phase; prepare and display results
            System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
// determine whether more than 8 students passed
            if (passes > 8) {
                System.out.println("Bonus to instructor!");
            }
        }
    }


