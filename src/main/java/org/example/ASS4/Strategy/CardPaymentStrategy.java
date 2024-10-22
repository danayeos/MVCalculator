// Класс, реализующий оплату банковской картой
public class CardPaymentStrategy implements PaymentStrategy {

    // Комиссия за оплату картой — 2%
    private static final double CARD_FEE_PERCENT = 0.02;

    @Override
    public double calculateFinalPrice(double orderPrice) {
        // Добавляем комиссию 2% к стоимости заказа
        return orderPrice + (orderPrice * CARD_FEE_PERCENT);
    }
}
