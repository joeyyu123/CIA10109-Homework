package hw9;

public class Hw9_1 implements Runnable {
    int counter = 1;
    String name;

    public Hw9_1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (counter <= 10) {
            System.out.println(name + "吃第" + counter + "碗飯");
            try {
                long l = (long) (Math.random() * 2500 + 500);
                Thread.sleep(l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;
        }
        System.out.println(name + "吃完了!");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Hw9_1("饅頭人"));
        Thread t2 = new Thread(new Hw9_1("詹姆士"));

        System.out.println("大胃王比賽開始");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("大胃王比賽結束");
    }
}
