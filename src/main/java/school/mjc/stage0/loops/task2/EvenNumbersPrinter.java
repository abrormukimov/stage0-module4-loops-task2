package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int counter = 2;
        while (counter <= printTillInclusive) {
            System.out.println(counter);
            counter += 2;
        }
    }
}