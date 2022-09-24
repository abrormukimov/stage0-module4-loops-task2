package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        while (count <= printToInclusive) {
            System.out.println(
                    calculateItsFactorialNumber(count)
            );
            count++;
        }
    }

    public int calculateItsFactorialNumber(int number) {
        int factorial = 1;
        int count = 1;
        while (count <= number) {
            factorial *= count;
            count++;
        }
        return factorial;
    }
}