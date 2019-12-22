package MThread;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * Create by jingzfan on 2019/5/7.
 */
public class Pipe {

    public static void main(String[] args) throws IOException {
        PipedWriter out = new PipedWriter();
        PipedReader in = new PipedReader();
        out.connect(in);
        Thread printThread = new Thread(new Print(in), "print");
        printThread.start();
        int receive = 0;
        try {
            while ((receive = System.in.read()) != -1) {
                out.write(receive);
            }
        } finally {
            out.close();
        }

    }

    static class Print implements Runnable {
        private PipedReader in;

        public Print(PipedReader in) {
            this.in = in;
        }

        @Override
        public void run() {
            int receive = 0;
            try {
                while ((receive = System.in.read()) != -1) {
                    System.out.println((char) receive);
                }
            } catch (Exception e) {

            }
        }
    }
}
