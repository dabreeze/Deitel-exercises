package chapterFour;
import java.util.Scanner;
// distance between two points
// accept input as cordinates for the two points
// check if any of the point is perpendicular to an axis

public class FourPointThreeSeven {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter X coordinate");
        int x_axis = userInput.nextInt();

        System.out.println("enter Y coordinate");
        int y_axis = userInput.nextInt();

        if(y_axis == 45 && y_axis == 45){
            System.out.println("both coordinates are perpendicular to each other");
        }else if (x_axis == 45 && y_axis != 45){
            System.out.println("X axis is perpendicular on the same plane");
        }else if (x_axis != 45 && y_axis == 45){
            System.out.println("Y axis is perpendicular on the same plane");
        }else {
            System.out.println("Both coordinates are not perpendicular on the plane");
        }

    }


}
