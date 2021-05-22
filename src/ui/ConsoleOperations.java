package ui;

import model.FlagStrip;

public class ConsoleOperations {

    private final FlagStrip fs;
    private final static String ESC = "\u001b[";

    public ConsoleOperations(FlagStrip fs) {
        this.fs=fs;
    }

    public void pause(long rate) {
        try {
            Thread.sleep(rate);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void print(long ms, long start) {
        for(int i=0;i<100;i++){
            System.out.print(fs.getColor()+ESC+i+"G"+ESC+start+"d");
            for (int j = 0; j < fs.getWidth(); j++){
                pause(ms);
                System.out.print(fs.getColor()+ESC+i+"G"+ESC + (start + j) + "d" + " ");
            }
        }
    }
}
