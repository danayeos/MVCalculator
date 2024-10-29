import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Класс CalculatorController связывает модель и представление
public class CalculatorController {

    private final CalculatorModel model;
    private final CalculatorView view;

    // Конструктор принимает модель и представление, устанавливает связь между ними
    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        // Регистрируем обработчик событий для кнопок
        this.view.addOperationListener(new OperationListener());
    }

    // Внутренний класс для обработки событий нажатий кнопок
    private class OperationListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                // Получаем введенные числа из представления
                double first = view.getFirstNumber();
                double second = view.getSecondNumber();
                double result = 0;

                // Определяем, какую операцию нужно выполнить
                if (e.getSource() == view.addButton) {
                    result = model.add(first, second);
                } else if (e.getSource() == view.subtractButton) {
                    result = model.subtract(first, second);
                } else if (e.getSource() == view.multiplyButton) {
                    result = model.multiply(first, second);
                } else if (e.getSource() == view.divideButton) {
                    result = model.divide(first, second);
                }

                // Устанавливаем результат в представление
                view.setResult(String.valueOf(result));

            } catch (NumberFormatException ex) {
                // Обработка ошибки, если введено не число
                view.setResult("Ошибка: введите корректные числа.");
            } catch (ArithmeticException ex) {
                // Обработка ошибки деления на ноль
                view.setResult(ex.getMessage());
            }
        }
    }
}
