import java.util.Scanner;

class NumberIsZeroException extends Exception {

    public void printError() {
        System.out.println("Number Is Zero Or Less Than Zero");
    }

}

public class PrimeExceptionSimple {
    public static void main(String[] args) {
        boolean isDivisible = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = input.nextInt();
        try {
            check(n);
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    // n divisible by i hai
                    isDivisible = true;
                    break;
                }
            }

            if (isDivisible == true)
                System.out.println("Not Prime");
            else
                System.out.println("Prime");
        } catch (NumberIsZeroException e) {
            e.printError();
        }
        input.close();
    }

    public static void check(int n) throws NumberIsZeroException {
        if (n <= 0) {
            throw new NumberIsZeroException();
        }
    }
    
}
