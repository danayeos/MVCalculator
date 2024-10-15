// Абстрактный класс для обработки платежей, определяющий структуру цепочки
abstract class PaymentHandler {
    protected PaymentHandler nextHandler; // Ссылка на следующий обработчик в цепочке

    // Метод для установки следующего обработчика
    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Абстрактный метод, который должен реализовываться в конкретных обработчиках
    public abstract void handlePayment(double amount);
}
