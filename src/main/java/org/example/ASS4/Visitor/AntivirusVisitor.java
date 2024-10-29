// Посетитель для выполнения антивирусной проверки файлов
public class AntivirusVisitor implements Visitor {

    @Override
    public void visit(TextFile textFile) {
        // Проверка текстового файла на наличие запрещённых слов
        String content = textFile.getContent();
        if (content.contains("запрещённое слово")) {
            System.out.println("Найдено запрещённое слово в текстовом файле.");
        } else {
            System.out.println("Текстовый файл безопасен.");
        }
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        // Проверка исполняемого файла на наличие вредоносного кода
        String binaryCode = executableFile.getBinaryCode();
        if (binaryCode.contains("вредоносный код")) {
            System.out.println("Найден вредоносный код в исполняемом файле.");
        } else {
            System.out.println("Исполняемый файл безопасен.");
        }
    }
}
