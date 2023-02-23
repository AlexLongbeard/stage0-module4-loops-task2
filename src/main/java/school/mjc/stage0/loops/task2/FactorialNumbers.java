package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i=1;
        int counter = 1;
        if (printToInclusive==0) {
            System.out.println("1");
        }
        else {
            while (i<=printToInclusive) {
                System.out.println(i*counter);
                i=i+1;
                counter=i*counter;
            }
            }
        }

}
