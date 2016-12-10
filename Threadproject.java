package threadproject;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadProject {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // crea un nuovo thread e lancia il metodo run();
        myThread.start();

        MyThread mYThread = new MyThread();
        // crea un nuovo thread e lancia il metodo run();
        mYThread.start();

    }

}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int c = 0; c < 10; c++) {

            try {
                System.out.println(Thread.currentThread().getId() + "Value: " + c);

                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
