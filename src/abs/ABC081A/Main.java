import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ca = s.toCharArray();
        int sum = 0;
        for (char c : ca) {
            sum = sum + Integer.parseInt(String.valueOf(c));
        }
        System.out.println(sum);    
        
    }
}
