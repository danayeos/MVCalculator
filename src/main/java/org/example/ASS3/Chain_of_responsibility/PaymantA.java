// Класс для способа оплаты A
class PaymentA extends PaymentHandler {
    private double balance = 100; // Баланс для оплаты A

    @Override
    public void handlePayment(double amount) {
        // Проверка, достаточно ли средств на балансе A
        if (balance >= amount) {
            System.out.println("Оплата в размере $" + amount + " произведена с помощью PaymentA.");
        } else {
            System.out.println("Недостаточно средств в PaymentA. Перенаправление к следующему способу.");
            if (nextHandler != null) {
                nextHandler.handlePayment(amount); // Передача запроса следующему обработчику
            }
        }
    }
}

