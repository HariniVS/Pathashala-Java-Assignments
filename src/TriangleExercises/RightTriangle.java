package TriangleExercises;

import java.util.Scanner;

/**
 * Created by harinivs on 01/05/17.
 */
public class RightTriangle {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int triangleLimit = scannerObject.nextInt();
        int index, noOfAsterisks = 1;
        for(index = 0; index < triangleLimit; index++, noOfAsterisks++){
            for(int asterisks = 0; asterisks < noOfAsterisks; asterisks++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
