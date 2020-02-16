import java.lang.*;

public class RandomDivider{

    StatusThread statusThread=new StatusThread();

    int divider=1;

    public int getDivider() {
        return divider;
    }

    public void setDivider(int divider) {
        this.divider = divider;
    }



    public void createDivider() throws InterruptedException {
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        setDivider(statusThread.getStatus());
        }



    Thread thread1=new Thread(()->{
        System.out.println("Start thread 1");
        apparentCalculator();
        statusThread.setStatus(11);
        System.out.println("Stop thread 1");
    });

    Thread thread2=new Thread(()->{
        System.out.println("Start thread 2");
        apparentCalculator();
        statusThread.setStatus(12);
        System.out.println("Stop thread 2");
    });

    Thread thread3=new Thread(()->{
        System.out.println("Start thread 3");
        apparentCalculator();
        statusThread.setStatus(13);
        System.out.println("Stop thread 3");
    });

    Thread thread4=new Thread(()->{
    System.out.println("Start thread 4");
    apparentCalculator();
    statusThread.setStatus(14);
    System.out.println("Stop thread 4");
    });

    Thread thread5=new Thread(()->{
    System.out.println("Start thread 5");
    apparentCalculator();
    statusThread.setStatus(15);
    System.out.println("Stop thread 5");
    });

public void apparentCalculator(){
    Counter c = new Counter();
        for (int i = 0; i < 1000000; i++) {
            c.increment();
        }
}
}
