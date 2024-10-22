// Класс, управляющий состоянием плеера
public class Player {
    private PlayerState state; // Текущее состояние плеера

    public Player() {
        // По умолчанию плеер находится в состоянии остановки
        this.state = new StoppedState();
    }

    // Устанавливаем новое состояние плеера
    public void setState(PlayerState state) {
        this.state = state;
    }

    // Метод для воспроизведения
    public void play() {
        state.play(this);
    }

    // Метод для паузы
    public void pause() {
        state.pause(this);
    }

    // Метод для остановки
    public void stop() {
        state.stop(this);
    }
}
