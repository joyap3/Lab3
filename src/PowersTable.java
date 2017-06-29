import java.util.Scanner;
import java.util.Formatter;
import java.lang.Math;
/**
 * Created by joyapuryear on 6/28/17.
 */
public class PowersTable {
    public static void main(String[] args) {
        //System.out.println("hello world");
        Scanner scan = new Scanner(System.in);
        int userNum = 0;
        int i = 0;

        System.out.println("Learn your squares and cubes! \n");
        System.out.print("Enter an integer:");
        userNum = scan.nextInt();


        System.out.printf("%s%16s%16s ","Number", "Squared", "Cubed");

        while ( i <= userNum){

            System.out.printf("%d%16d%16d%n",userNum, (int)Math.pow(userNum,2),(int)Math.pow(userNum,3));


        }

        i++;
    }
}
