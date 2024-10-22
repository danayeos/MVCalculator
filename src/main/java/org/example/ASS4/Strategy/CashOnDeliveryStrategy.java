// Класс, реализующий наложенный платёж
public class CashOnDeliveryStrategy implements PaymentStrategy {

    // Дополнительная стоимость доставки при наложенном платеже — 300 рублей
    private static final double DELIVERY_FEE = 300.0;

    @Override
    public double calculateFinalPrice(double orderPrice) {
        // Добавляем 300 рублей к стоимости заказа за наложенный платёж
        return orderPrice + DELIVERY_FEE;
    }
}
