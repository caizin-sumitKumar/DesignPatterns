package com.example.duck;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestUtil {

    public static String captureOutput(Runnable action) {

        PrintStream old = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setOut(new PrintStream(out));
        action.run();
        System.setOut(old);

        return out.toString().trim();
    }
}
