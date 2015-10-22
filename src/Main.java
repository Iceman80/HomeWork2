public class Main {
    public static void main(String[] args) {
        int q = 21;
        int w = 8;
        int n = 74;
        double dou = 234.456;
        int n1 = 365;

        System.out.println("1. " + q + "/" + w + "=" + q / w + " и " + q % w + " в остатке");
        System.out.println("2. Сумма цифр числа " + n + " = " + (n / 10 + n % 10));
        System.out.println("3. Округляем число - " + dou + " до ближайшего целого - " + (int) dou);
        System.out.println("4. Сумма цифр числа " + n1 + " = " + (n1 / 100 + (n1 % 100) / 10 + n1 % 10));

    }
}
