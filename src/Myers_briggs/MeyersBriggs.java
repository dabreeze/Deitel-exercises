package Myers_briggs;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

// prompt user with a question
// prompt a user to make a choice from 1 to 5
// store these data using link list Array
// loop through the array for these key values
// calculate the total number
public class MeyersBriggs {

        public static int i;

        public static String getResponse() {
                Scanner response = new Scanner(System.in);
                String userResponse = response.nextLine();

                return userResponse;
        }

        public static void displayHeaderLine() {
                System.out.println();
                System.out.println("                A                                    B");
                System.out.println("|=============================|       |===============================|");

        }

        public static void displayMessage()
        {
                String[] myers = {"(A) Expend energy, enjoy groups OR (B)conserve energy, enjoy one-on-one", "interpret literally ",
                        "look for meaning and possibilities", "(A) logical, thinking, questioning empathetic (B.) feeling, accommodating",
                        "organized, orderly flexible, adaptable", "more out going, think out loud more reserved, think to yourself",
                        "practical, realistic, experimental imaginative, innovative, theoretical", "candid, straight " +
                        "forward, frank tactful, kind, encouraging", "plan, schedule unplanned, spontaneous",
                        "seek many task, public activities, interaction with others seek private, solitary activities" +
                                " with quite to concentrate", "standard, usual, conventional different, novel, unique",
                        "firm, tend to criticize, hold the line gentle, tend to appreciate, conciliate", "regulated, " +
                        "structured easygoing, live and let live", "external, communicative, express yourself " +
                        "internal, reticent, keep to yourself", "focus on here and now look to the future," +
                        " global perspective, Big picture", "tough-minded, just tender-hearted, merciful",
                        "preparation, plan ahead go with the flow, adapt as you go", "active, initiate reflective, " +
                        "deliberate", "facts, things, what-is ideas, dreams, what could be, philosophical",
                        "matter of fact, issue-oriented sensitive, people-oriented, compassion",
                        "control, govern latitude, freedom"};
                String[] userValue = new String[myers.length];
                System.out.print("");
                for (int j = 0; j < myers.length; j++) {

                        System.out.println(myers[j]);
                        String response = getResponse();
                        userValue[j] = response;

                }
                System.out.println(Arrays.toString(userValue));
        }




}