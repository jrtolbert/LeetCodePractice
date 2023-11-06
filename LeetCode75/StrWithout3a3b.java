package LeetCode75;

public class StrWithout3a3b {

    public static String strWithout3a3b(int a, int b) {
        if (a + b < 4) {
            String result = "";
            for (int i = 0; i < a; i++) {
                result += "a";
            }

            for (int i = 0; i < b; i++) {
                result += "b";
            }

            return result;
        }

        String container = "";

        while(a + b > 0) {
            boolean aD = a > b + 1 && b > 0;
            boolean bD = b > a + 1 && a > 0;
            if (aD) {
                container += "aab";
                a-=2;
                b--;
            } else if (bD) {
                container += "bba";
                b -= 2;
                a--;
            } else {
                if (a > 0) {
                    container += "a";
                    a--;
                }
                if (b > 0) {
                    container += "b";
                    b--;
                }
            }
        }


        return container;
    }

    public static void main(String[] args) {
        System.out.println(strWithout3a3b(6,3));
    }

}
