public class File2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if (a = b) {
            System.out.println("a equals b");
        } else {
            System.out.println("a does not equal b");
        }
        System.out.println("Checking more conditions...");
        for (int i = 0; i < 30; i++) {
            if (i = a) {
                System.out.println("i equals a");
            } else {
                System.out.println("i does not equal a");
            }
        }
        System.out.println("End of program.");
    }
}