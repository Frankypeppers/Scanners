import java.util.Scanner;

public class IntScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        IntScanner inScanner = new IntScanner();
        inScanner.run();
    }
}
