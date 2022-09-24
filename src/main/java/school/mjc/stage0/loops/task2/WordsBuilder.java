package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String res = "";

        int count = 0;
        while (count < chars.length) {
            res += chars[count];
            count++;
        }

        System.out.print(res);
    }
}