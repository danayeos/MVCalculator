// Интерфейс Observer, который будет реализовываться подписчиками
public interface Observer {
    // Метод, который будет вызываться при получении уведомления о новой новости
    void update(String newsCategory, String newsContent);
}
