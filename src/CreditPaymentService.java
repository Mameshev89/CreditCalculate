public class CreditPaymentService {
    public double calculate(double procent, int sumCredit, int numMonth) {
        double monthProcent = procent / 12 / 100;
        double caf = monthProcent * Math.pow((1 + monthProcent), numMonth) / (Math.pow((1 + monthProcent), numMonth) - 1);
        double monthPayment = caf * sumCredit;
        return monthPayment;
    }
}
