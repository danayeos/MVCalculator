// Главный класс приложения, инициализирует модель, представление и контроллер
public class CalculatorApp {
    public static void main(String[] args) {
        // Создаем модель
        CalculatorModel model = new CalculatorModel();

        // Создаем представление
        CalculatorView view = new CalculatorView();

        // Создаем контроллер
        new CalculatorController(model, view);

        // Отображаем окно
        view.setVisible(true);
    }
}
