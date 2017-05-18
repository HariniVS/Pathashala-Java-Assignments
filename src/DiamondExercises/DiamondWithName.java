package DiamondExercises;

import java.util.Scanner;

/**
 * Created by harinivs on 01/05/17.
 */
public class DiamondWithName {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int triangleLimit = scannerObj.nextInt();
        int index, spaces,asterisks, noOfAsterisks = 1, noOfSpaces = triangleLimit-1;
        for(index = 1; index < triangleLimit; index ++, noOfAsterisks+=2, noOfSpaces--) {
            for(spaces = 0; spaces < noOfSpaces; spaces++ ) {
                System.out.print(" ");
            }
            for (asterisks = 0; asterisks < noOfAsterisks; asterisks++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (index = triangleLimit; index > 0; index--, noOfAsterisks-=2, noOfSpaces++) {
            for (spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            if (index == triangleLimit) {
                System.out.print("Harini");
            } else {
                for (asterisks = 0; asterisks < noOfAsterisks; asterisks++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
