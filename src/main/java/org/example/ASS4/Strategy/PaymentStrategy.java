// Интерфейс, описывающий стратегию оплаты
public interface PaymentStrategy {
    // Метод для расчёта финальной стоимости заказа
    double calculateFinalPrice(double orderPrice);
}
