package test.NIO;

import java.nio.IntBuffer;

public class NioDetailSample {
    public static void main(String[] args) {
        NioDetailSample sample = new NioDetailSample();
        sample.checkBuffer();
    }

    public void checkBuffer() {
        try {
            IntBuffer buffer = IntBuffer.allocate(1024);
            for (int i = 0; i < 100; i++) {
                buffer.put(i);
            }

            System.out.println("Buffer capacity = " + buffer.capacity() );
            System.out.println("Buffer limit = " + buffer.limit() );
            System.out.println("Buffer position = " + buffer.position());
            System.out.println("Buffer flipped " );
            System.out.println("Buffer limit = " + buffer.limit());
            System.out.println("Buffer position = " + buffer.position());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
