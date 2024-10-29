// Интерфейс итератора
public interface Iterator<T> {
    boolean hasNext();  // Проверка, есть ли следующий элемент
    T next();           // Возврат следующего элемента
}
