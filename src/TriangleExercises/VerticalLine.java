package TriangleExercises;

import java.util.Scanner;

/**
 * Created by harinivs on 01/05/17.
 */
public class VerticalLine {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int verticalLimit = scannerObject.nextInt();
        int index;
        for(index = 0; index < verticalLimit; index++) {
            System.out.println("*");
        }
    }
}
