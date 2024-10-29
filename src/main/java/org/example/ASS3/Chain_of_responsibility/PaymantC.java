// Класс для способа оплаты C
class PaymentC extends PaymentHandler {
    private double balance = 1000; // Баланс для оплаты C

    @Override
    public void handlePayment(double amount) {
        // Проверка, достаточно ли средств на балансе C
        if (balance >= amount) {
            System.out.println("Оплата в размере $" + amount + " произведена с помощью PaymentC.");
        } else {
            System.out.println("Недостаточно средств в PaymentC.");
        }
    }
}

