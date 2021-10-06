package chapterThree;
import java.util.Scanner;
public class HeartRateMain {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        HeartRate mary = new HeartRate("Mary", "Joe");
        System.out.println("please enter your full name:");
        mary.setFirstName(userInput.nextLine());
        System.out.println("Surname please");
        mary.setLastName(userInput.nextLine());
        System.out.println("Hello welcome "+ mary.getFirstName()+" "+mary.getLastName());
        System.out.println("Enter date of birth year/month/day:");
        mary.setDateOfBirt(userInput.nextInt(), userInput.nextInt(), userInput.nextInt());
        mary.calculateAge();
        System.out.print("Date of Birth: ");
        mary.displayDateOfBirth();
        System.out.print("Age: ");
        mary.getAge();
        System.out.print("maximum Heart Beat Rate: ");
        mary.displayHeartBeatRange();
        System.out.print("Heart Beat Range: ");
        mary.calculateHeartBeatRange();


    }
}
