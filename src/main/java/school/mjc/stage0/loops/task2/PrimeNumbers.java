package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 2;
        while (count <= printToInclusive) {
            if (isPrimeNumber(count)) {
                System.out.println(count);
            }
            count++;
        }

    }
    public boolean isPrimeNumber(int number) {
        int dividers = 0;
        int count = 1;
        while (count <= number) {
            if (number % count == 0) {
                dividers++;
            }
            count++;
        }

        return dividers == 2;
    }
}