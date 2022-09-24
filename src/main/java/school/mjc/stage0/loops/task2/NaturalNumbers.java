package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int counter = 0;
        while (counter != lastPrinted) {
            System.out.println(counter);
            counter++;
        }
        System.out.println(lastPrinted);
    }
}