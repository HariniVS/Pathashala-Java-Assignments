package DiamondExercises;

import java.util.Scanner;

/**
 * Created by harinivs on 01/05/17.
 */
public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int triangleLimit = scannerObj.nextInt();
        int index, noOfAsterisks = 1, noOfSpaces = triangleLimit-1;
        for(index = 0; index < triangleLimit; index ++) {//, noOfAsterisks+=2, noOfSpaces--) {
//            for(int spaces = 0; spaces < noOfSpaces; spaces++ ) {
//                System.out.print(" ");
//            }
//            for(int asterisks = 0; asterisks < noOfAsterisks; asterisks++) {
//                System.out.print("*");
//            }
            int spaces = 0, asterisks = 0;
            while(spaces++ < noOfSpaces) {
                System.out.print("=");
            }
            while(asterisks++ < noOfAsterisks ) {
                System.out.print("*");
            }
            noOfSpaces -= 1;
            noOfAsterisks +=2;
        System.out.println();
        }
    }
}
