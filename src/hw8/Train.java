package hw8;

import java.util.*;

/**
 * 請設計一個Train類別，並包含以下屬性：
 * - 班次number，型別為int - 車種type，型別為String - 出發地start，型別為String
 * - 目的地dest，型別為String - 票價price，型別為double
 * • 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
 * 需使用的集合裡
 * - (202, "普悠瑪", "樹林", "花蓮", 400)
 * - (1254, "區間", "屏東", "基隆", 700)
 * - (118, "自強", "高雄", "台北", 500)
 * - (1288, "區間", "新竹", "基隆", 400)
 * - (122, "自強", "台中", "花蓮", 600)
 * - (1222, "區間", "樹林", 七堵, 300)
 * - (1254, "區間", "屏東", "基隆", 700)
 */
public class Train implements Comparable<Train> {
    private int number;
    private String type;
    private String start;
    private String dest;

    private double price;

    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Train train) {
        if (this == train) {
            return 0;
        }
        if (this.number > train.number) {
            return -1;
        } else if (this.number == train.number) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number && Double.compare(price, train.price) == 0 && Objects.equals(type, train.type) && Objects.equals(start, train.start) && Objects.equals(dest, train.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }

    @Override
    public String toString() {
        return "number=" + number +
                ", type='" + type + '\'' +
                ", start='" + start + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price;
    }

    public static void main(String[] args) {
        Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
        Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
        Train t3 = new Train(118, "自強", "高雄", "台北", 500);
        Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
        Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
        Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
        Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

        List<Train> trains = new ArrayList<>();
        trains.add(t1);
        trains.add(t2);
        trains.add(t3);
        trains.add(t4);
        trains.add(t5);
        trains.add(t6);
        trains.add(t7);

        Set<Train> hashSet = new HashSet<>(trains);

        for (Train train : hashSet) {
            System.out.println(train);
        }

        System.out.println("-------------------------");
        Collections.sort(trains);
        for (Train train : trains) {
            System.out.println(train);
        }

        System.out.println("-------------------------");

        Set<Train> treeSet = new TreeSet<>(trains);
        for (Train train : treeSet) {
            System.out.println(train);
        }
    }
}
