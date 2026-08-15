import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LoginMonitor monitor = new LoginMonitor();

        System.out.println("===== LOGIN ATTEMPT MONITOR =====");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("How many failed login attempts? ");
        int attempts = scanner.nextInt();

        for (int i = 0; i < attempts; i++) {
            monitor.failedLogin();
        }

        System.out.println("\nUsername: " + username);

        monitor.showStatus();

        scanner.close();
    }
}