import java.util.Scanner;

public class MultiplyScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if(scanner.hasNext()) {
                int a = scanner.nextInt();
                int sum = a * 3;
                System.out.println(sum);
            }
        }
    }

    public static void main(String[] args) {
        MultiplyScanner mpScanner = new MultiplyScanner();
        mpScanner.run();
    }
}

// multiply 
//int a = scanner.nextInt();
//int sum = a*3;
//System.out.println(sum);