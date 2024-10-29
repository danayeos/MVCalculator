import java.util.Stack;

// Класс Caretaker, управляющий снимками
public class Caretaker {
    private Stack<TextMemento> mementoStack = new Stack<>();

    // Сохранить состояние редактора
    public void saveMemento(TextMemento memento) {
        mementoStack.push(memento);
    }

    // Восстановить последнее сохраненное состояние
    public TextMemento restoreMemento() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null;
    }
}

