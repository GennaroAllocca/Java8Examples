package main.java;

import java.util.*;
import java.io.*;

class App2 implements Closeable {
    public void close() throws IOException {
        System.out.print("r1 ");
        //throw new FileNotFoundException();
    }
}

class MyResource2 implements AutoCloseable {
    public void close() throws IOException {
        System.out.print("r2 ");
       // throw new FileNotFoundException();
    }
}

public class CloseableExample2 {
    public static void main(String[] args) {
        try (App2 r1 = new App2();
              MyResource2 r2 = new MyResource2();) {
            System.out.print("try ");
            throw new RuntimeException("TOTO");
        } catch (Exception e) {


            System.out.println(e.toString());

            System.out.print("catch ");
            for (Throwable t : e.getSuppressed()) {
                System.out.println(t.getClass().getName());
            }
        }
    }
} 