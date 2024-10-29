// Класс, представляющий телевизор
public class Television {
    private int volume = 10;
    private int channel = 1;

    // Метод для включения телевизора
    public void turnOn() {
        System.out.println("Телевизор включен.");
    }

    // Метод для выключения телевизора
    public void turnOff() {
        System.out.println("Телевизор выключен.");
    }

    // Метод для увеличения громкости
    public void volumeUp() {
        volume++;
        System.out.println("Громкость увеличена до " + volume);
    }

    // Метод для уменьшения громкости
    public void volumeDown() {
        volume--;
        System.out.println("Громкость уменьшена до " + volume);
    }

    // Метод для смены канала на следующий
    public void nextChannel() {
        channel++;
        System.out.println("Канал переключен на " + channel);
    }

    // Метод для смены канала на предыдущий
    public void previousChannel() {
        channel--;
        System.out.println("Канал переключен на " + channel);
    }
}
