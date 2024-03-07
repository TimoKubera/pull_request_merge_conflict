public class File3 {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length());
        System.out.println("Checking more strings...");
        for (int i = 0; i < 30; i++) {
            String t = i % 2 == 0 ? null : String.valueOf(i);
            if (t != null) {
                System.out.println("The length of string " + t + " is " + t.length());
            } else {
                System.out.println("String is null, cannot get length.");
            }
        }
        System.out.println("End of program.");
    }
}