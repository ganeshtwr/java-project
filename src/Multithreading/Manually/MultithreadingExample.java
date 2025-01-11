package Multithreading.Manually;

public class MultithreadingExample {

    public static void main(String[] args) {

        // By Normal way
        Thread t1 = new Thread(new TaskA());
        t1.start();

        // By Lambda Expression
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                methodB();
            }

            private void methodB() {
                System.out.println("Method B is called");
            }
        });
        t2.start();

        // By Method referencing
        new Thread(() -> {
            methodC();
        }).start();
    }

    private static void methodC() {
        System.out.println("Method B is called");
    }
}

class TaskA implements Runnable {
    public void run() {
        methodA();
    }

    private void methodA() {
        System.out.println("Method A is called");
    }
}

class TaskB implements Runnable {
    public void run() {
        methodB();
    }

    private void methodB() {
        System.out.println("Method B is called");
    }
}

class TaskC implements Runnable {
    public void run() {
        methodC();
    }

    private void methodC() {
        System.out.println("Method C is called");
    }
}