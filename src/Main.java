public class Main {
    public static void main(String[] args) {
        Randoms randoms = new Randoms(90, 100);
        for (Object rObj : randoms) {
            int r = (int) rObj;
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, на этом закончим");
                break;
            }
        }
    }
}