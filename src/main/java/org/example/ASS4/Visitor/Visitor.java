// Интерфейс посетителя, который определяет методы для посещения разных типов файлов
public interface Visitor {
    void visit(TextFile textFile);      // Метод для работы с текстовыми файлами
    void visit(ExecutableFile executableFile);  // Метод для работы с исполняемыми файлами
}
