package ArrayList.chapterFifteen;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFilePath {
    private static String filePath;
    public static Path readFile(String input){
        filePath = input;

        return Path.of(filePath);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter file path");
        Path path = Paths.get(sc.nextLine());
        System.out.println(path.getFileName());
        System.out.println(path.toAbsolutePath());
        String fileLocation = String.valueOf(readFile(String.valueOf(path)));

        System.out.println(fileLocation);


    }
}
