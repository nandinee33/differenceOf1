import java.util.Scanner;

public class differenceOf1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int temp, n1, n2, n11;

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long arr[] = new long[n];
            temp = 0;

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLong();
                if (arr[j] < k) {
                    String s = String.valueOf(arr[j]);
                    if (s.length() >= 2) {
                        n11 = 0;
                        for (int k1 = 0; k1 < s.length() - 1; k1++) {
                            n1 = s.charAt(k1);
                            n2 = s.charAt(k1 + 1);
                            if (n1 - n2 == 1 || n2 - n1 == 1) {
                                n11 = n11 + 1;
                            } else
                                break;
                        }
                        if (n11 + 1 == s.length()) {
                            System.out.print(s + " ");
                            temp = 1;
                        }



                    }
                }
            }
            if (temp == 0)
                System.out.print("-1");
            System.out.println();
        }
    }
}
