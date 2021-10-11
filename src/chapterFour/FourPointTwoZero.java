package chapterFour;
// A Salary Calculator
// calculate for 3 employees
// determine hours spent
// if above 40hours calculate the ecxess by half
// display the earningss
import java.util.Scanner;


public class FourPointTwoZero {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
//        int user = userInput.nextInt();
//

        long weeklyBaseEarning = 200;
        double weeklyEarnings;
        int hourlyRate = 200/(5*8);
        double extraHourlyRate = (200/(5*8)*1.5);
        int quantityOfItemsSold = 0;
        int pricePerEachItem = 0;
        int TotalNumberOfHourSpentInAWeek = 0;
        int extraHours=0;
        double hourlyBonusPay = 0;

        weeklyEarnings = weeklyBaseEarning + (quantityOfItemsSold * pricePerEachItem * 0.09);
        extraHours = TotalNumberOfHourSpentInAWeek - 40;
        hourlyBonusPay = extraHourlyRate * extraHours;

        int employeeFirst = 0;
        int employeeSecond = 0;
        int employeeThird = 0;
//        System.out.println("");

        while(true){
            if(userInput.nextInt() > 0) {



                    System.out.println("Hours spent for Employee 1: ");
                    employeeFirst = userInput.nextInt();


                    double newPay1 = weeklyEarnings + hourlyBonusPay * employeeFirst;

                    System.out.println("Hours spent for Employee 2: ");
                    employeeSecond = userInput.nextInt();
                    double newpPay2 = weeklyBaseEarning + hourlyBonusPay * employeeSecond;

                    System.out.println("Hours spent for Employee 3: ");
                    employeeThird = userInput.nextInt();
                    double newPay3 = weeklyBaseEarning + employeeThird;


                System.out.println("employee 1");
                System.out.println("Hours--- Pay-----Extra Time Pay---");
                System.out.println();
                System.out.println(employeeFirst + " ---- " + weeklyEarnings + " ---- " + newPay1);
                System.out.println(employeeSecond + " ---- " + weeklyEarnings + " ---- " + newpPay2);
                System.out.println(employeeThird+" ---- "+ weeklyEarnings+ " ---- "+newPay3);


            }else System.out.println("End of program");
            System.exit(-1);





            }

        }
   }

