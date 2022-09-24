package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        if (multiplyByAndToInclusive < 0) {
            while (counter <= -multiplyByAndToInclusive) {
                System.out.println(multiplyByAndToInclusive * counter);
                counter++;
            }
        }
        while (counter <= multiplyByAndToInclusive && multiplyByAndToInclusive != 0) {
            System.out.println(multiplyByAndToInclusive * counter);
            counter++;
        }
    }
}