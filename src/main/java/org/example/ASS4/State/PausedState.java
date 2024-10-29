// Класс, описывающий состояние паузы плеера
public class PausedState implements PlayerState {

    @Override
    public void play(Player player) {
        // Возобновляем воспроизведение, переводим плеер в состояние воспроизведения
        System.out.println("Возобновление воспроизведения.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        // Если плеер уже на паузе, выводим соответствующее сообщение
        System.out.println("Плеер уже на паузе.");
    }

    @Override
    public void stop(Player player) {
        // При остановке сбрасываем трек и переводим плеер в состояние остановки
        System.out.println("Остановка воспроизведения. Трек сброшен.");
        player.setState(new StoppedState());
    }
}
