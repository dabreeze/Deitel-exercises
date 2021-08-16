package chapterFive;
// an app that prints a diamond

public class FivePointTwoFour {
    public static void main(String[] args) {
        int i, j;
        int numberOfRows= 5;

        for(i =0; i <= numberOfRows; i ++){
            for(j = 1; j<=numberOfRows-i; j++){
                System.out.print(" ");
            }
            for (j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i = numberOfRows-1; i>=1; i--){
            for (j=1; j<=numberOfRows-i; j++){
                System.out.print(" ");
            }
            for (j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}