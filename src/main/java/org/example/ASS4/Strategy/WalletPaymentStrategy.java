// Класс, реализующий оплату через электронный кошелёк (без комиссии)
public class WalletPaymentStrategy implements PaymentStrategy {

    @Override
    public double calculateFinalPrice(double orderPrice) {
        // Оплата через кошелёк не требует комиссии
        return orderPrice;
    }
}
