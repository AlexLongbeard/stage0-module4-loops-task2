package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        int counter = 1;
        if (power==0) {
            System.out.println("1");
        }
        else if (power>0) {
            while (i<=power) {
                System.out.println(counter);
                i=i+1;
                counter=counter*2;
            }
        }
        else System.out.println("too much power");
    }
}
