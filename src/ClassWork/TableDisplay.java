package ClassWork;
import java.lang.*;

public class TableDisplay {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        System.out.println();
        System.out.print("    ");
        for(i =0; i<9; i++)
        {
            System.out.print(i+"  ");
        }
        System.out.println();
        System.out.print("    ");
        for(i=0; i<50; i++)
        {
            System.out.print("=");;
        }
        System.out.println();
        for(i =0; i<9; i++)
        {
            System.out.println(i+"  | ");
        }
        System.out.println();
        System.out.print("   ");
        for(i=0; i<50; i++)
            System.out.print("=");
    }


}
