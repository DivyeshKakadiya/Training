import java.util.*;
public class series7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int j = 1;
        
        while (i <= n) {
            System.out.println(i * j);
            i++;
            j *= -1;
        }
    }
}
