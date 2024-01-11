public class Ex02 {
    public static void main(String[] args) {
        String a = "ABCDE";

        char[] caa = a.toCharArray();

        System.out.println(caa[0]);

        for (int i = 0; i < caa.length; i++) {
            System.out.println(caa[i]);
        }
    }
}
