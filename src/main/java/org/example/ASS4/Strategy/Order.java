// Класс, представляющий заказ
public class Order {
    private double price; // Стоимость заказа
    private PaymentStrategy paymentStrategy; // Стратегия оплаты

    // Конструктор для создания заказа с определённой стоимостью
    public Order(double price) {
        this.price = price;
    }

    // Метод для установки стратегии оплаты
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Метод для расчёта итоговой стоимости с учётом выбранной стратегии оплаты
    public double calculateFinalPrice() {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Стратегия оплаты не установлена.");
        }
        return paymentStrategy.calculateFinalPrice(price);
    }
}
