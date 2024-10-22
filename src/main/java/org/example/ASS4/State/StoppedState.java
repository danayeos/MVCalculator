// Класс, описывающий состояние остановки плеера
public class StoppedState implements PlayerState {

    @Override
    public void play(Player player) {
        // Начинаем воспроизведение с начала и переводим плеер в состояние воспроизведения
        System.out.println("Начало воспроизведения трека.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        // В состоянии остановки нельзя поставить на паузу
        System.out.println("Плеер в остановленном состоянии. Нельзя поставить на паузу.");
    }

    @Override
    public void stop(Player player) {
        // Если плеер уже остановлен, выводим соответствующее сообщение
        System.out.println("Плеер уже остановлен.");
    }
}
