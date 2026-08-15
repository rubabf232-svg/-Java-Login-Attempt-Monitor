public class LoginMonitor {

    private int failedAttempts = 0;

    public void failedLogin() {
        failedAttempts++;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void showStatus() {

        System.out.println("\n===== SECURITY STATUS =====");
        System.out.println("Failed Attempts: " + failedAttempts);

        if (failedAttempts >= 5) {
            System.out.println("Status: ALERT");
            System.out.println("Message: Possible brute-force activity detected.");
        }
        else if (failedAttempts >= 3) {
            System.out.println("Status: WARNING");
            System.out.println("Message: Multiple failed login attempts detected.");
        }
        else {
            System.out.println("Status: NORMAL");
            System.out.println("Message: Login activity is normal.");
        }
    }
}
