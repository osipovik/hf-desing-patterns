package oik.designpatterns.decorator.io;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class LowerCaseInputStreamTest {
    @Test
    public void lowerCaseInputStreamTest() {
        int c;
        StringBuffer sb = new StringBuffer();

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(new FileInputStream("test.txt")));

            while ((c = in.read()) >= 0) {
                sb.append((char) c);
            }

            System.out.println(sb.toString());
            assertEquals("i know the decorator pattern and how it's used in the java.io package.",
                    sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}