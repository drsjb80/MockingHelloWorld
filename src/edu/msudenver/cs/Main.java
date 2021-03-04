package edu.msudenver.cs;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
	    System.out.println("Hello world!");
    }

    @Test
    public void testHelloWorld() {
        ByteArrayOutputStream BAOS = new ByteArrayOutputStream();
        System.setOut(new PrintStream(BAOS));
        Main.main(new String[0]);
        assertEquals("Hello world!\n", BAOS.toString());
    }
}
