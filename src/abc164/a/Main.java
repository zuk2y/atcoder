import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int w = sc.nextInt();
        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
        
    }
}
