package chapterSix;
// Application to display 3310 menu
// prompt the user to enter a choice from 1 to 13
import java.awt.*;
import java.util.Scanner;
public class Nokia3310 {

    public static void main(String[] args) {
        int phoneBookMenu=0;
        int message =0;
        int chat = 0;
        int callRegister=0;
        int tone = 0;
        int setting =0;
        int callDivert =0;
        int game = 0;
        int calculator = 0;
        int reminder = 0;
        int clock = 0;
        int profile = 0;
        int simService = 0;



        System.out.println("NOKIA Connecting People!");
        System.out.println();


        System.out.println("----- Press Number for Menu! ----> ");
        System.out.println();
        System.out.println("1 --> Phone Book  ");
        System.out.println("2 --> Message");
        System.out.println("3 --> Chat");
        System.out.println("4 --> Call Register");
        System.out.println("5 --> Tones");
        System.out.println("6 --> Settings");
        System.out.println("7 --> Call divert");
        System.out.println("8 --> Games");
        System.out.println("9 --> Calculator");
        System.out.println("10 --> Reminder");
        System.out.println("11 --> Clock");
        System.out.println("12 --> Profile");
        System.out.println("13 --> SIM services");

        Scanner userInput = new Scanner(System.in);
        int userChoiceMainMenu= userInput.nextInt();



        switch (userChoiceMainMenu){

            case (1):
                System.out.println("---- Phone Book ---->");
                System.out.println();
                System.out.println("1 -> Search");
                System.out.println("2 -> Service Nos.");
                System.out.println("3 -> Add Name");
                System.out.println("4 -> Erase");
                System.out.println("5 -> Edit");
                System.out.println("6 -> Assign tone");
                System.out.println("7 -> Send b'card");
                System.out.println("8 -> Options");
                System.out.println("9 -> Speed dials");
                System.out.println("10 -> Voice tags");
                phoneBookMenu = userInput.nextInt();
                switch (phoneBookMenu){

                    case (1):
                        System.out.println("<---- Search ---->");
                        break;
                    case (2):
                            System.out.println("<--- Service Nos. --->");

                        break;
                    case (3):
                        System.out.println("<--- Add Name --->");
                        break;
                    case (4):
                        System.out.println("<--- Erase --->");
                        break;
                    case (5):
                        System.out.println("<--- Edit --->");
                        break;
                    case (6):
                        System.out.println("<--- Assign tone --->");
                        break;
                    case (7):
                        System.out.println("<--- Send b'card --->");
                    case (8):
                        int option=0;
                        System.out.println("<--- Options --->");
                        System.out.println();
                        System.out.println("1 -> Type of View");
                        System.out.println("2. -> Memory Status");
                        option = userInput.nextInt();
                        switch (option){
                            case (1):
                                System.out.println("<--- Type of View --->");
                                break;
                            case (2):
                                System.out.println("<--- Memory Status --->");
                        }
                        break;
                    case (9):
                        System.out.println("<--- Speed dials --->");
                        break;
                    case (10):
                        System.out.println("<--- Voice tags --->");
                        break;

                }
                break;
            case (2):

                System.out.println(">--- Message --->");
                System.out.println();
                System.out.println("1--> Write messages");
                System.out.println("2--> Inbox");
                System.out.println("3--> Outbox");
                System.out.println("4--> Picture messages");
                System.out.println("5--> Templates");
                System.out.println("6--> Smileys");
                System.out.println("7--> Message settings");
                System.out.println("8--> Info service");
                System.out.println("9--> Voice mailbox number");
                System.out.println("10--> Service command editor");

                message = userInput.nextInt();
               switch (message){
                   case (1):
                       System.out.println("<-- Write messages -->");
                       break;
                   case (2):
                       System.out.println("<-- Inbox -->");
                       break;
                   case (3):
                       System.out.println("<-- Outbox -->");
                       break;
                   case (4):
                       System.out.println("<-- Picture message -->");
                       break;
                   case (5):
                       System.out.println("<-- Templates -->");
                       break;
                   case (6):
                       System.out.println("<-- Smileys -->");
                       break;
                   case (7):
                       System.out.println("<-- Message Settings-->");
                       System.out.println();
                       System.out.println("1 -> Set");
                       System.out.println("2 -> Common");
                       int messageSettings = 0;
                       messageSettings = userInput.nextInt();
                       switch (messageSettings){
                           case (1):
                               System.out.println("<--- Set --->");
                               System.out.println();
                               System.out.println("1 -> Message center number");
                               System.out.println("2 -> Message sent as");
                               System.out.println("3 -> Message validity");
                               break;
                           case (2):
                               System.out.println("<--- Common --->");
                               System.out.println();
                               System.out.println("1 -> Delivery reports");
                               System.out.println("2 -> Reply via same centre");
                               System.out.println("3 -> Character support");
                               break;
                       }
                       break;
                   case (8):
                       System.out.println("8 <--- Info service --->");
                       break;
                   case (9):
                       System.out.println("<--- Voice mailbox number --->");
                       break;
                   case (10):
                       System.out.println("<--- Service command editor --->");
                       break;

               }
                break;
            case (3):
                System.out.println("<--- Chat --->");

                break;
            case (4):
                System.out.println("<--- Call Register --->");
                System.out.println();
                System.out.println("1 --> Missed calls ");
                System.out.println("2 --> Received calls ");
                System.out.println("3 --> Dialled numbers ");
                System.out.println("4 --> Erase recent call lists ");
                System.out.println("5 --> show call duration ");
                System.out.println("6 --> Show call costs ");
                System.out.println("7 --> Call cost settings ");
                System.out.println("8 --> Prepaid credit ");
                callRegister = userInput.nextInt();
                switch (callRegister){
                    case (1):
                        System.out.println("<-- Missed calls -->");
                        break;
                    case (2):
                        System.out.println("<-- Received calls -->");
                        break;
                    case (3):
                        System.out.println("<-- Dialled numbers -->");
                        break;
                    case (4):
                        System.out.println("<-- Erase recent call list -->");
                        break;
                    case (5):
                        System.out.println("<-- Show call duration -->");
                        System.out.println();
                        System.out.println("1 -> Last call duration");
                        System.out.println("2 -> All calls' duration");
                        System.out.println("3 -> Received calls' duration");
                        System.out.println("4 -> Dialled calls' duration");
                        System.out.println("5 -> Clear timers");
                        int showCallDuration = 0;
                        showCallDuration = userInput.nextInt();
                        switch (showCallDuration){
                            case (1):
                                System.out.println("<--- Last call duration ---> ");
                                break;
                            case (2):
                                System.out.println("<--- All calls' duration --->");
                                break;
                            case (3):
                                System.out.println("<--- Received calls' duration --->");
                                break;
                            case (4):
                                System.out.println("<--- Dialled calls' duration");
                                break;
                            case (5):
                                System.out.println("<--- Clear timer --->");
                                break;
                        }
                        break;
                    case (6):
                        System.out.println("<-- Show call cost -->");
                        System.out.println();
                        System.out.println("1 --> Last call cost");
                        System.out.println("2 --> All calls' cost");
                        System.out.println("3 --> Clear counters");
                        int showCallCost = userInput.nextInt();
                        switch (showCallCost){
                            case (1):
                                System.out.println("<--- Last call cost --->");
                                break;
                            case (2):
                                System.out.println("<--- All calls' cost --->");
                                break;
                            case (3):
                                System.out.println("<--- Clear counters --->");
                                break;
                        }
                        break;
                    case (7):
                        System.out.println("<-- Call cost settings -->");
                        System.out.println();
                        System.out.println("1 --> Call cost limit");
                        System.out.println("2 --> Show costs in");
                        int callCostSettings = userInput.nextInt();
                        switch (callCostSettings){
                            case (1):
                                System.out.println("<--- Call cost limit --->");
                                break;
                            case (2):
                                System.out.println("<--- Show cost in --->");
                                break;
                        }
                        break;
                    case (8):
                        System.out.println("<-- Prepaid credit -->");
                        break;

                }
                break;
            case (5):
                System.out.println("<--- Tones --->");
                System.out.println();
                System.out.println("1 --> Ringing tone");
                System.out.println("2 --> Ringing volume");
                System.out.println("3 --> Incoming call alert");
                System.out.println("4 --> Composer");
                System.out.println("5 --> Message alert tone");
                System.out.println("6 --> Keypad tones");
                System.out.println("7 --> Warning and game tones");
                System.out.println("8 --> Vibrating alert");
                System.out.println("9 --> Screen saver");
                tone = userInput.nextInt();

                switch (tone){
                    case (1):
                        System.out.println("<-- Ringing tone -->");
                        break;
                    case (2):
                        System.out.println("<-- Ringing volume -->");
                        break;
                    case (3):
                        System.out.println("<-- Incoming call alert -->");
                        break;
                    case (4):
                        System.out.println("<-- Composer -->");
                        break;
                    case (5):
                        System.out.println("<-- Message alert tone -->");
                        break;
                    case (6):
                        System.out.println("<-- Keypard tones -->");
                        break;
                    case (7):
                        System.out.println("<-- Warning and game tones -->");
                        break;
                    case (8):
                        System.out.println("<-- Vibrating alert -->");
                        break;
                    case (9):
                        System.out.println("<-- Screen saver -->");
                        break;
                }
                break;
            case (6):
                System.out.println(">--- Settings --->");
                System.out.println();
                System.out.println("1 --> Call settings");
                System.out.println("2 --> Phone Settings");
                System.out.println("3 --> Security settings");
                System.out.println("4 --> Restore factory settings");
                setting = userInput.nextInt();
                switch (setting){
                    case (1):
                        System.out.println("<-- Call settings -->");
                        System.out.println();
                        System.out.println("1 --> Automatic redial");
                        System.out.println("2 --> Speed dialling");
                        System.out.println("3 --> Call waiting options");
                        System.out.println("4 --> Own number sending");
                        System.out.println("5 --> Phone line in use");
                        System.out.println("6 --> Automatic answer");
                        int callSettings = userInput.nextInt();
                        switch (callSettings){
                            case (1):
                                System.out.println("<-- Automatic redial -->");
                                break;
                            case (2):
                                System.out.println("<-- Speed dialling -->");
                                break;
                            case (3):
                                System.out.println("<-- Call waiting option -->");
                                break;
                            case (4):
                                System.out.println("<-- Own number sending -->");
                                break;
                            case (5):
                                System.out.println("<-- Phone line in use -->");
                                break;
                            case (6):
                                System.out.println("<-- Automatic answer -->");
                                break;
                        }
                        break;
                    case (2):
                        System.out.println("<-- Phone settings -->");
                        System.out.println();
                        System.out.println("1 --> Language");
                        System.out.println("2 --> cell info display");
                        System.out.println("3 --> Welcome note");
                        System.out.println("4 --> network selection");
                        System.out.println("5 --> Lights");
                        System.out.println("6 --> Confirm SIM service action");

                        break;
                    case (3):
                        System.out.println("<-- Security settings -->");
                        System.out.println();
                        System.out.println("1 --> PIN code request");
                        System.out.println("2 --> Call barring service");
                        System.out.println("3 --> Fixed dialling");
                        System.out.println("4 --> Closed user group");
                        System.out.println("5 --> Phone security");
                        System.out.println("6 --> Change access code");
                        break;
                    case (4):
                        System.out.println("<-- Restore factory settings -->");
                }
                break;
            case (7):
                System.out.println("<--- Call divert --->");
                break;
            case (8):
                System.out.println("<--- Games --->");
                break;
            case (9):
                System.out.println("<--- Calculator --->");
                break;
            case (10):
                System.out.println("<--- Reminder --->");
                break;
            case (11):
                System.out.println("<--- Clock --->");
                System.out.println();
                System.out.println("1 --> Alarm clock");
                System.out.println("2 --> Clock settings");
                System.out.println("3 --> Date settings");
                System.out.println("4 --> Stopwatch");
                System.out.println("5 --> Countdown timer");
                System.out.println("6 --> Auto update of date and time");
                clock = userInput.nextInt();
                switch (clock){
                    case (1):
                        System.out.println("<-- Alarm clock -->");
                        break;
                    case (2):
                        System.out.println("<-- Clock settings -->");
                        break;
                    case (3):
                        System.out.println("<-- Date settings -->");
                        break;
                    case (4):
                        System.out.println("<-- Stopwatch -->");
                        break;
                    case (5):
                        System.out.println("<-- Countdown timer -->");
                        break;
                    case (6):
                        System.out.println("<-- Auto update of date and time -->");
                }
                break;
            case (12):
                System.out.println("<--- Profile --->");
                break;
            case (13):
                System.out.println("<--- SIM services --->");
                break;

        }

    }

}
