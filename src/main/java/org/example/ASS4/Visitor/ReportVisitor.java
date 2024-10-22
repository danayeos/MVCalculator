// Посетитель для генерации отчёта о проверке файлов
public class ReportVisitor implements Visitor {

    @Override
    public void visit(TextFile textFile) {
        // Генерация отчёта для текстового файла
        System.out.println("Отчёт: Текстовый файл содержит " + textFile.getContent().length() + " символов.");
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        // Генерация отчёта для исполняемого файла
        System.out.println("Отчёт: Исполняемый файл содержит " + executableFile.getBinaryCode().length() + " символов.");
    }
}
