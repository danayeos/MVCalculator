import Assignment4.Observer.*;
import Assignment4.State.Player;
import Assignment4.Strategy.*;
import Assignment4.TemplateMethod.*;
import Assignment4.Visitor.*;

public class Main {
    public static void main(String[] args) {
        // 1. Паттерн Наблюдатель (Observer)
        System.out.println("=== Паттерн Наблюдатель (Observer) ===");
        NewsPublisher newsPublisher = new NewsPublisherImpl();

        // Добавляем подписчиков (наблюдателей)
        newsPublisher.addObserver(new NewsSubscriberLaptop("Дана"));
        newsPublisher.addObserver(new NewsSubscriberSmartphone("Улдана"));
        newsPublisher.addObserver(new NewsSubscriberTablet("Данок"));

        // Оповещаем подписчиков о новостях в разных категориях
        newsPublisher.notifyObservers("Шоппинг", "покуупайте на на на");
        newsPublisher.notifyObservers("Технологии", "SpaceX успешно запустила ракету!");

        System.out.println("\n");

        // 2. Паттерн Состояние (State)
        System.out.println("=== Паттерн Состояние (State) ===");
        Player player = new Player();

        // Проверяем работу мультимедийного плеера в разных состояниях
        player.play();  // Воспроизведение
        player.pause(); // Пауза
        player.play();  // Возобновление
        player.stop();  // Остановка

        System.out.println("\n");

        // 3. Паттерн Стратегия (Strategy)
        System.out.println("=== Паттерн Стратегия (Strategy) ===");
        Order order1 = new Order(new CardPaymentStrategy(), 1234);   // Оплата картой
        Order order2 = new Order(new WalletPaymentStrategy(), 1234); // Оплата электронным кошельком
        Order order3 = new Order(new CashOnDeliveryStrategy(), 1234); // Оплата при доставке

        // Рассчитываем итоговую стоимость заказа для разных способов оплаты
        System.out.println("Цена при оплате картой: " + order1.calculateFinalPrice());
        System.out.println("Цена при оплате электронным кошельком: " + order2.calculateFinalPrice());
        System.out.println("Цена при оплате наложенным платежом: " + order3.calculateFinalPrice());

        System.out.println("\n");

        // 4. Паттерн Шаблонный метод (Template Method)
        System.out.println("=== Паттерн Шаблонный метод (Template Method) ===");

        // Проверка качества продуктов
        QualityCheck foodCheck = new FoodQualityCheck();
        System.out.println("Проверка качества продуктов питания:");
        foodCheck.checkProduct(); // Проверка продуктов питания

        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        System.out.println("\nПроверка качества электроники:");
        electronicsCheck.checkProduct(); // Проверка электроники

        System.out.println("\n");

        // 5. Паттерн Посетитель (Visitor)
        System.out.println("=== Паттерн Посетитель (Visitor) ===");

        // Сканируем файлы с помощью антивируса
        TextFile textFile = new TextFile("Пример текстового файла.");
        ExecutableFile executableFile = new ExecutableFile("Пример исполняемого файла.");

        Visitor antivirusVisitor = new AntivirusVisitor();
        Visitor reportVisitor = new ReportVisitor();

        System.out.println("Антивирусное сканирование:");
        textFile.accept(antivirusVisitor);         // Проверка текстового файла антивирусом
        executableFile.accept(antivirusVisitor);   // Проверка исполняемого файла антивирусом

        System.out.println("\nГенерация отчётов:");
        textFile.accept(reportVisitor);            // Генерация отчёта для текстового файла
        executableFile.accept(reportVisitor);      // Генерация отчёта для исполняемого файла
    }
}
