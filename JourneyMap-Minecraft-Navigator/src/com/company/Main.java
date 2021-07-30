package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot r = new Robot();
        r.setAutoDelay(1);
        int longDuration = 475102;
        int shortDuration = 4000;
        System.out.println("Waiting for 5 seconds...");
        Thread.sleep(5000L);
        System.out.println("Here I go!");

        for (int i = 0; i < 100; ++i) {
            System.out.println("Moving Forward");
            r.keyPress(87);
            Thread.sleep((long) longDuration);
            System.out.println("Releasing Forward");
            r.keyRelease(87);
            System.out.println("Waiting...");
            Thread.sleep(5000L);
            System.out.println("Moving Right");
            r.keyPress(68);
            Thread.sleep((long) shortDuration);
            System.out.println("Releasing Right");
            r.keyRelease(68);
            System.out.println("Waiting...");
            Thread.sleep(5000L);
            System.out.println("Moving Backward");
            r.keyPress(83);
            Thread.sleep((long) longDuration);
            System.out.println("Releasing Backward");
            r.keyRelease(83);
            System.out.println("Waiting...");
            Thread.sleep(5000L);
            System.out.println("Moving Right");
            r.keyPress(68);
            Thread.sleep((long) shortDuration);
            System.out.println("Releasing Right");
            r.keyRelease(68);
            System.out.println("Waiting...");
            Thread.sleep(5000L);
            System.out.println("Finished iteration " + i);
            System.out.println();
        }
    }
}
