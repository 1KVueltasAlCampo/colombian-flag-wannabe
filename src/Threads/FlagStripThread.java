package Threads;

import ui.ConsoleOperations;

public class FlagStripThread extends Thread {
    private final ConsoleOperations use;
    private final int ms;
    private final int start;

    public FlagStripThread(ConsoleOperations use, int ms, int start) {
        this.use = use;
        this.ms = ms;
        this.start = start;
    }

        @Override
        public void run() {
            use.print(ms, start);
        }
}
