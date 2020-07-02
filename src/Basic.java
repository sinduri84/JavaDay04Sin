public class Basic {

    static void printNumbers(int aNumber) {
        for(int i = 0; i < aNumber; i++) {
            System.out.println(i + 1);
        }
    }

    static void printEvenNumbers(int aNumber) {
        for (int i = 0; i <= aNumber; i+=2) {
            if (i == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        //A1 Exercise
        System.out.println("A1 Exercise\n");
        printNumbers(100);

        //A2 Exercise
        System.out.println("A2 Exercise\n");
        printEvenNumbers(100);

    }
}
