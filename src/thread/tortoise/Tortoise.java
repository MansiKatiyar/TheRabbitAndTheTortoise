package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Thread {

    private static final int MILESTONES = 5;

    public Tortoise() {
        super("Tortoise");
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached to the Oak Tree");
                    System.out.println("The Tortoise is leading and hence is going to sleep!");
                    try {
                        Thread.sleep(18000L);
                    } catch (InterruptedException e) {
                        System.err.println("The Tortoise sleep got interrupted!");
                    }
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    break;

            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("The Tortoise has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has completed the race!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
