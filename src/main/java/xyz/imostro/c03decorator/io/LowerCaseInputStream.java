package xyz.imostro.c03decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 继承 FilterInputStream 对象实现新的装饰类，把输入的字符转换成小写
 */
public class LowerCaseInputStream  extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = read();
        return read == -1 ? read : Character.toLowerCase(read);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int size = read(b, off, len);
        for (int i=0; i<size; i++){
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return size;
    }
}
