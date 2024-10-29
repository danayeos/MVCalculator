import java.util.ArrayList;
import java.util.List;

// Реализация интерфейса NewsPublisher, которая управляет подписчиками и рассылает уведомления
public class NewsPublisherImpl implements NewsPublisher {
    // Список подписчиков, которые будут получать уведомления
    private List<Observer> subscribers = new ArrayList<>();

    // Метод для добавления подписчика
    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    // Метод для удаления подписчика
    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    // Метод для уведомления всех подписчиков о новой новости
    @Override
    public void notifySubscribers(String newsCategory, String newsContent) {
        // Проходим по всем подписчикам и вызываем их метод update
        for (Observer observer : subscribers) {
            observer.update(newsCategory, newsContent);
        }
    }
}
