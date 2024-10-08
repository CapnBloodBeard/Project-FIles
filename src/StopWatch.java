import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long stopTime;
    private boolean running;

    // Start the stopwatch
    public void start() {
        startTime = System.currentTimeMillis();
        running = true;
        System.out.println("Stopwatch started...");
    }

    // Stop the stopwatch
    public void stop() {
        stopTime = System.currentTimeMillis();
        running = false;
        System.out.println("Stopwatch stopped...");
    }

    // Calculate the elapsed time in seconds
    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = System.currentTimeMillis() - startTime;
        } else {
            elapsed = stopTime - startTime;
        }
        return elapsed / 1000; // convert milliseconds to seconds
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StopWatch stopwatch = new StopWatch();  // Create an instance of StopWatch
        
        System.out.println("Press 1 to start the stopwatch, 2 to stop it.");
        
        while (true) {
            int input = scan.nextInt();
            if (input == 1) {
                stopwatch.start();
            } else if (input == 2) {
                stopwatch.stop();
                System.out.println("Elapsed time in seconds: " + stopwatch.getElapsedTime());
                break;
            } else {
                System.out.println("Invalid input. Please press 1 to start or 2 to stop.");
            }
        }
        scan.close();  // Close the scanner
    }
}
