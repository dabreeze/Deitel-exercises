package Seven_segment;

import java.util.Arrays;
import java.util.Scanner;

public class SevenSegmentDisplay {
    private static int row = 5;
    private static int column = 4;
    private static int[][] screen = new int[row][column];





    private void displayScreen() {
        for (int[] row : screen) {
            for (int column : row) {
                int i = screen[row.length][column]=1;
                System.out.print(i);
                System.out.print("  ");



            }
            System.out.println();
        }
    }


    public void setScreen() {
        displayScreen();
            screen[0][0] = 0;
            screen[0][1] = 0;
            screen[0][2] = 1;
            screen[0][3] = 0;
            screen[1][0] = 1;
            screen[1][1] = 1;
            screen[1][2] = 1;
            screen[1][3] = 1;
            screen[2][0] = 1;
            screen[2][1] = 1;
            screen[2][2] = 1;
            screen[2][3] = 1;
            screen[3][0] = 1;
            screen[3][1] = 1;
            screen[3][2] = 1;
            screen[3][3] = 1;
            screen[4][0] = 1;
            screen[4][1] = 1;
            screen[4][2] = 1;
            screen[4][3] = 1;
            displayScreen();

    }

    public static int[][] getScreen() {
        return screen;
    }

}