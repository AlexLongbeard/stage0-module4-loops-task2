package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        int result;
        if (multiplyByAndToInclusive > 0) {
            while (i <= multiplyByAndToInclusive) {
                result = i * multiplyByAndToInclusive;
                System.out.println(result);
                i = i + 1;
            }
        } else if (multiplyByAndToInclusive < 0) {
            while (i <= (multiplyByAndToInclusive * (-1))) {
                result = i * multiplyByAndToInclusive;
                System.out.println(result);
                i = i + 1;
            }
        } else {
            System.out.println("");
        }
    }
}