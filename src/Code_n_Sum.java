import java.util.Scanner;

public class Code_n_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    long sum = 0;

    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {

    final long x = sc.nextLong(); // read input

    String str = Long.toString((long) Math.pow(1 << 1, x));

    str = str.length() > 2 ? str.substring(str.length() - 2) : str;

    sum += Integer.parseInt(str);

}

    logger.debug(sum%100);
    }
}
