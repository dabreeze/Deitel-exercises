package chapterFive;

public class FivePointOneFive {
    public static void main(String[] args) {
        int num = 10;
        for (int rows = 1; rows<= num; rows += 1) {

            for (int cols = 1; cols <= rows; cols += 1) {
                System.out.print("*");
            }
            for(int j = rows; j <=num; j+=1){
                System.out.print(" ");
            }
            for(int j = rows; j <=num; j+=1){
                System.out.print("*");
            }
            for (int cols = 1; cols <= rows; cols += 1) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols += 1) {
                System.out.print(" ");
            }
            for(int j = rows; j <=num; j+=1){
                System.out.print("*");
            }
            for(int j = rows; j <=num; j+=1){
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols += 1) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}