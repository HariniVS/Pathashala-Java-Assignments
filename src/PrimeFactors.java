import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by harinivs on 01/05/17.
 */
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int inputNumber = scannerObj.nextInt();
        List<Integer> primeFactors = generatePrimeFactor(inputNumber);
        for (int factors: primeFactors) {
            System.out.print(factors+" ");
        }
    }

    private static List<Integer> generatePrimeFactor(int num) {
        List<Integer> prime = new LinkedList<Integer>();
        int index = 0;
        while (num % 2 == 0) {
            prime.add(2);
            num /= 2;
        }
        for (index = 3; index <= StrictMath.sqrt(num); index += 2) {
            while (num % index == 0) {
                prime.add(index);
                num/=index;
            }
        }
        if (num > 2) {
            prime.add(num);
        }
        return prime;
    }
}
