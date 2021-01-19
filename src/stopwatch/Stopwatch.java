package stopwatch;

import java.util.Scanner;

public class Stopwatch {

    public static int numberOfSeconds = 1;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type 'start' to start the stopwatch:");

        while (true) {
            String user_input = scan.nextLine();
            
            try {
                Thread.sleep(1000);
                System.out.println(numberOfSeconds++);   
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
