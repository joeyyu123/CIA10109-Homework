package hw9;

class Depot {
    private int balance = 0;

    public Depot() {
    }

    public synchronized void deposit(int dollars) {
        while (balance > 3000) {
            System.out.println("媽媽看到戶頭金額大於3000，暫停匯款");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        balance += dollars;
        System.out.println("匯款: " + dollars + "，餘額: " + balance);
        notify();
    }

    public synchronized void withdraw(int dollars) {
        while (balance < dollars) {
            try {
                System.out.println("雄大看到帳戶沒錢，暫停提款");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        balance -= dollars;
        System.out.println("提領: " + dollars + "，餘額: " + balance);

        if (balance <= 2000) {
            System.out.println("雄大看到餘額低於2000，要求匯款");
            notify();
        }
    }
}

class Bear extends Thread {
    Depot depot;

    public Bear(Depot depot) {
        this.depot = depot;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            depot.withdraw(1000);
        }
    }
}

class Mom extends Thread {
    Depot depot;

    public Mom(Depot depot) {
        this.depot = depot;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            depot.deposit(2000);
        }
    }
}

public class Hw9_2 {
    public static void main(String[] args) {
        Depot depot = new Depot();
        Bear bear = new Bear(depot);
        Mom mom = new Mom(depot);

        mom.start();
        bear.start();

        try {
            bear.join();
            mom.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("over");

    }
}
