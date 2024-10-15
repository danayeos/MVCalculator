// Класс для способа оплаты B
class PaymentB extends PaymentHandler {
    private double balance = 300; // Баланс для оплаты B

    @Override
    public void handlePayment(double amount) {
        // Проверка, достаточно ли средств на балансе B
        if (balance >= amount) {
            System.out.println("Оплата в размере $" + amount + " произведена с помощью PaymentB.");
        } else {
            System.out.println("Недостаточно средств в PaymentB. Перенаправление к следующему способу.");
            if (nextHandler != null) {
                nextHandler.handlePayment(amount); // Передача запроса следующему обработчику
            }
        }
    }
}
