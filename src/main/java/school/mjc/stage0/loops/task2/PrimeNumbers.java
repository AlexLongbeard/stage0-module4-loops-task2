package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i=3;
        boolean isPrime = true;
        if (printToInclusive<2) {
            System.out.println("");
        }
        else {
            System.out.println("2");
            while (i<=printToInclusive) {
                int j = 2;
                while (j<i) {
                    if (i%j==0) {
                        isPrime = false;
                    }
                    j=j+1;
                }
                if (isPrime==true) {
                    System.out.println(i);
                }
                i=i+1;
            }
        }

    }
}
