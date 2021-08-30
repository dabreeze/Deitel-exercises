package chapterFour;
// A Salary Calculator
// calculate for 3 employees
// determine hours spent
// if above 40hours calculate the ecxess by half
// display the earningss
import java.util.Scanner;


public class FourPointTwoZero {
    public static void main(String[] args) {
    String employee = " ";
    double newPay = 0 ;
        int extraHours=0;
        int weeklySalary = 0;
    int numberOfHourSPent = 0;
    int hourlyRate = 200;
    double bonusHourPay = 0;
        double thirdBonusHourPay = 0;
        double secondBonusHourPay =0;
        int employeeFirst = 0;
        int employeeSecond = 0;
        int employeeThird = 0;

        Scanner userInput = new Scanner(System.in);
        System.out.println("");
        for (int i = 0; i < +3; i++) {


            weeklySalary = hourlyRate * numberOfHourSPent;
            extraHours = numberOfHourSPent - 40;
            newPay = extraHours / 0.5;
            //System.out.println(extraHours);

            if(numberOfHourSPent > 40){
                System.out.println("Hours spent for Employee : "+ (i +1));
                employeeFirst = userInput.nextInt();

                bonusHourPay = newPay + weeklySalary;

                System.out.println("Hours spent for Employee : "+ (i +1));
                employeeSecond = userInput.nextInt();
                secondBonusHourPay = newPay + weeklySalary;

                System.out.println("Hours spent for Employee : "+ (i +1));
                employeeThird = userInput.nextInt();
                thirdBonusHourPay = newPay + weeklySalary;



            }

        }
        System.out.println("employee 1");
        System.out.println("Hours--- Pay-----Extra Time Pay---");
        System.out.println();
        System.out.println(employeeFirst+" ---- "+ weeklySalary+ " ---- "+bonusHourPay);
        System.out.println(employeeSecond+" ---- "+ weeklySalary+ " ---- "+secondBonusHourPay);
        System.out.println(employeeThird+" ---- "+ weeklySalary+ " ---- "+thirdBonusHourPay);
    }

}
