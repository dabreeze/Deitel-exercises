package chapterEight;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

class TimeOneTest {
    public static void main(String[]args){
        TimeOne nigeria = new TimeOne();


        nigeria.setTime(13,12,34);
        System.out.println(nigeria.toUniversalString());
    }

}