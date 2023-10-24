import java.util.Scanner;

public class PrintScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        PrintScanner prScanner = new PrintScanner();
        prScanner.run();
    }
}
