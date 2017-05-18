package TriangleExercises;

import java.util.Scanner;

/**
 * Created by harinivs on 01/05/17.
 */
public class HorizontalLine {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int noOfAsterisks = scannerObject.nextInt();
        int index;
        for(index = 0; index< noOfAsterisks; index++) {
            System.out.print("*");
        }
    }
}
