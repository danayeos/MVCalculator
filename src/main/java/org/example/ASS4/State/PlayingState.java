// Класс, описывающий состояние воспроизведения плеера
public class PlayingState implements PlayerState {

    @Override
    public void play(Player player) {
        // Если плеер уже воспроизводит, выводим сообщение
        System.out.println("Плеер уже воспроизводит.");
    }

    @Override
    public void pause(Player player) {
        // При паузе переводим плеер в состояние паузы
        System.out.println("Пауза воспроизведения.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(Player player) {
        // При остановке сбрасываем трек и переводим плеер в состояние остановки
        System.out.println("Остановка воспроизведения. Трек сброшен.");
        player.setState(new StoppedState());
    }
}
