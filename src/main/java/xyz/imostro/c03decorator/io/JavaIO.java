package xyz.imostro.c03decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.LineNumberInputStream;

public class JavaIO {

    public void stream() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("123");
        BufferedInputStream stream = new BufferedInputStream(fis);
    }
}
