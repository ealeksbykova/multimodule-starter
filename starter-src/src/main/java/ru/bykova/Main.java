package ru.bykova;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {
        LOG.info("Application started");
        System.out.println("I'm the main project");
        Simple simple = new Simple();
        simple.setValue(10);
        System.out.println("Value from Simple: " + simple.getValue());
        LOG.info("Application finished");
    }
}
