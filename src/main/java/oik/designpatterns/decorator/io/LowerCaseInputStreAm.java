package oik.designpatterns.decorator.io;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);

        for (int i = 0; i < off+result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }

        return super.read(b, off, len);
    }
}
