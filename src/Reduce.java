public class Reduce {
    public static void main(String[] args) {
        // Method
        System.out.println(reduceSteps(100));
        System.out.println(reduceSteps(1000));
    }

    private static int reduceSteps(int number) {
        int count = 0;

        while (number > 0) {
            if (number % 2 == 0) {
                number /= 2; }
            else {
                number -=1;
            }
            count++;
        }
        return count;
    }
}
