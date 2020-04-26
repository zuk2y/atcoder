import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        boolean flag = true;
        do {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    flag = false;
                    break;
                }
                a[i] = a[i] / 2;
            }
            if (flag) {
                count ++;  
            }
        } while (flag);
        System.out.println(count);
    }
}
