public class Main {
    public static void main(String[] args) {
        CreditPaymentService run = new CreditPaymentService();
        double monthSumPayment = run.calculate(9.99, 1000_000, 36);
        System.out.println(monthSumPayment);
    }
}
