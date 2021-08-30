package ClassWork;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeSummary {
    private static int studentCourses;
    private static int noOfStudent;
    private static int score;
    private static int validNumber;
    private static int aggregateSum;
    private static double average;


//    public static int getSum()
//    {
//        for(int i =0; i<studentCourses; i++ )
//        {
//            aggregateSum = aggregateSum + student[noOfStudent][studentCourses];
//        }
//
//        return aggregateSum;
//    }


    public int getScore() {
        return score;
    }

    public int getStudentCourses() {
        return studentCourses;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    private static int setNumber(int number)
    {
        Scanner input = new Scanner(System.in);
        while(number < 1){
            System.out.println("Invalid number Please Enter Number : ");
            number = input.nextInt();
        }
        System.out.println("number saved");
        validNumber = number;


        return validNumber;
    }
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        //StudentGradeSummary student = new StudentGradeSummary();
        int column;
        int row;

        System.out.println("Please Enter Number of Student: ");
        noOfStudent = setNumber(input.nextInt());


        System.out.println("Please enter number of Courses offered by each student: ");
        studentCourses = setNumber(input.nextInt());

        // stores content to the Array student
        int[][] student = new int[noOfStudent][studentCourses];
        int[] totalGradeScore = new int[noOfStudent];

        for(row=0; row<student.length; row++)
        {
            for(column= 0; column<studentCourses; column++)
            {
                System.out.println("Enter course: "+(column+1)+ " for Student: "+(row +1));
                student[row][column] = input.nextInt();

            }

        }
        // Displays the content of the Array
        for(row =0; row < noOfStudent; row++ ){
            for(column =0; column < studentCourses; column++){
                score = student[row][column];
                System.out.print(score + " ");
            }
            System.out.println();
        }
        int sum = 0;
        int[] eachStudentScore = new int[row];
        for(row = 0; row<student.length; row++)
        {
            for (column=0; column<student[row].length;column++)
            {
                eachStudentScore[row] += student[row][column];
            }
            System.out.println();
            System.out.print(eachStudentScore[row] + " ");
        }
        int real=0;

        for(column = 0; column< student[0].length; column++)
        {
            for(row=0; row < student[column].length; row++)
            {
                //totalGradeScore[column] += student[row][column];
              //  real += student[row][column];
            }
            System.out.println();
            System.out.println(real+" ");
            //System.out.println(totalGradeScore[column]+" ");
        }


        int[] book = new int[10];

        System.out.println(Arrays.toString(book));

        }


    }



