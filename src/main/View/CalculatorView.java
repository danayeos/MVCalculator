import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

// Класс CalculatorView создает и отображает пользовательский интерфейс для калькулятора
public class CalculatorView extends JFrame {

    // Поля для ввода чисел
    private final JTextField firstNumber = new JTextField(10);
    private final JTextField secondNumber = new JTextField(10);

    // Кнопки для арифметических операций
    private final JButton addButton = new JButton("+");
    private final JButton subtractButton = new JButton("-");
    private final JButton multiplyButton = new JButton("*");
    private final JButton divideButton = new JButton("/");

    // Поле для отображения результата
    private final JTextField result = new JTextField(10);

    // Конструктор, создающий интерфейс
    public CalculatorView() {
        // Настройка окна
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLayout(new GridLayout(3, 2));

        // Добавляем компоненты в окно
        add(new JLabel("Первое число:"));
        add(firstNumber);
        add(new JLabel("Второе число:"));
        add(secondNumber);
        add(new JLabel("Результат:"));
        add(result);

        // Панель для кнопок
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        // Добавляем панель с кнопками в окно
        add(buttonPanel);

        // Делаем результат недоступным для редактирования
        result.setEditable(false);
    }

    // Методы для получения введенных пользователем чисел
    public double getFirstNumber() {
        return Double.parseDouble(firstNumber.getText());
    }

    public double getSecondNumber() {

