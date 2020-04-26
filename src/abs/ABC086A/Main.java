import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a * b) % 2 == 0) {
            System.out.println("Even");    
        }else{
            System.out.println("Odd");
        }
    }
}
