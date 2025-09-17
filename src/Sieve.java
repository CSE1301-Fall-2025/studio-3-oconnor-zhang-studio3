import java.util.Arrays;
import java.util.Scanner;

public class Sieve {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("What is the upper bound of your number set?");
        int n = in.nextInt();

        boolean[] primeNumbers = new boolean[n];
        Arrays.fill(primeNumbers, true);
        
        for (int i = 2; i < Math.sqrt(n); i = i + 1) {
            if (primeNumbers[i] == true) {
                for (int j = i*i; j < n; j = j + i) {
                    primeNumbers[j] = false;
                }
            }
        }

        for (int i = 2; i <= primeNumbers.length; i++) {
            if (primeNumbers[i] == true) {
                System.out.println(i);

            }
        }
    }
}
