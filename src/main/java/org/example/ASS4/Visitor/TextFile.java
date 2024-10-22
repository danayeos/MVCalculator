// Класс для текстового файла
public class TextFile implements File {
    private String content;

    public TextFile(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Принимает посетителя и вызывает соответствующий метод
    }
}
