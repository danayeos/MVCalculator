// Интерфейс NewsPublisher для управления подписчиками и рассылки уведомлений
public interface NewsPublisher {
    // Метод для добавления нового подписчика
    void subscribe(Observer observer);

    // Метод для удаления подписчика
    void unsubscribe(Observer observer);

    // Метод для уведомления всех подписчиков о новой новости
    void notifySubscribers(String newsCategory, String newsContent);
}
