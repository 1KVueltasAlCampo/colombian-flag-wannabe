package ui;

import Threads.FlagStripThread;
import model.FlagStrip;

public class Main {
    private final static String RESET = "\033[0m";
    private final static String YELLOW = "\033[43m";
    private final static String BLUE = "\033[44m";
    private final static String RED = "\033[41m";
    private final static String ESC = "\u001b[";



    public static void main(String[] args) throws InterruptedException {
        start();
        threadsOperations();
        System.out.println(RESET + "\n");
    }

    public static void threadsOperations() throws InterruptedException {
        FlagStrip yellow = new FlagStrip(YELLOW, 11);
        FlagStrip blue = new FlagStrip(BLUE, 5);
        FlagStrip red = new FlagStrip(RED, 5);

        ConsoleOperations yellowUse = new ConsoleOperations(yellow);
        ConsoleOperations blueUse = new ConsoleOperations(blue);
        ConsoleOperations redUse = new ConsoleOperations(red);

        FlagStripThread yellowThread = new FlagStripThread(yellowUse, 11, 0);
        FlagStripThread blueThread = new FlagStripThread(blueUse, 45, 11);
        FlagStripThread redThread = new FlagStripThread(redUse, 60, 16);

        yellowThread.start();
        blueThread.start();
        redThread.start();

        yellowThread.join();
        blueThread.join();
        redThread.join();

    }

    public static void start() {
        System.out.print(ESC+"0G"+ESC+"0d");
        System.out.print(ESC+"2J");
    }


}
