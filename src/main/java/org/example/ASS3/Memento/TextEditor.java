// Класс текстового редактора
public class TextEditor {
    private String text;

    public TextEditor() {
        this.text = "";
    }

    // Добавить текст в редактор
    public void addText(String newText) {
        this.text += newText;
    }

    // Показать текущий текст
    public String getText() {
        return text;
    }

    // Создать снимок состояния текста
    public TextMemento save() {
        return new TextMemento(text);
    }

    // Восстановить текст из снимка
    public void restore(TextMemento memento) {
        this.text = memento.getText();
    }
}