/**
 * Created by harinivs on 01/05/17.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int limit = 0;
        while(limit++ < 100) {
            fizzBuzz(limit);
        }
    }

    private static void fizzBuzz(int limit) {
        if(limit % 3 == 0 && limit % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (limit % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (limit % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(limit);
        }

    }
}
