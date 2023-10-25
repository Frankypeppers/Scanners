import java.util.Scanner;

public class DlmScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter(",|\n");
        while (true) {
            String str = scanner.next();
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        DlmScanner dmScanner = new DlmScanner();
        dmScanner.run();
    }
}
