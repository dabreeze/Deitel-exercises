package chapterSix;
import java.util.Scanner;

public class SixPointSix {
    public static void sphereVolume(double radius)
    {

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius :");
        double radius = sc.nextInt();
       sphereVolume(3);

    }
}

