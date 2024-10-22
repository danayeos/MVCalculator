// Интерфейс, описывающий поведение плеера в каждом состоянии
public interface PlayerState {
    void play(Player player);  // Метод для воспроизведения
    void pause(Player player); // Метод для паузы
    void stop(Player player);  // Метод для остановки
}
