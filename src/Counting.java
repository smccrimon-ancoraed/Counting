
import java.sql.*;
import java.util.*;
/*



 */
public class Counting {

    public static void main(String[] args) {

        int i, j;
        int[] scores = new int[20];
// Let's set the scores equal to the index times 2.
        Scanner inputDevice = new Scanner(System.in);
        for (i = 0; i < scores.length; i++) {
            System.out.print(i+": Enter a number ?");
            scores[i] = inputDevice.nextInt();
            // mynames[i] = inputDevice.nextLine();
            System.out.println();
            // element will be equal to index * 2
        }  // For loop

        for (i = 0; i < scores.length; i++) {

            System.out.println("Scores["+i+"] = "+scores[i]);

        }



    }   // Main
}  // Class
