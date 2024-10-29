// Класс для исполняемого файла
public class ExecutableFile implements File {
    private String binaryCode;

    public ExecutableFile(String binaryCode) {
        this.binaryCode = binaryCode;
    }

    public String getBinaryCode() {
        return binaryCode;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Принимает посетителя и вызывает соответствующий метод
    }
}
