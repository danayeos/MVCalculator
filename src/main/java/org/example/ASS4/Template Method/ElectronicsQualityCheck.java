// Класс для проверки качества электронных товаров
public class ElectronicsQualityCheck extends QualityCheck {

    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Проверка электроники:");
        System.out.println("- Проверка работоспособности: устройство работает корректно.");
        System.out.println("- Проверка гарантии: гарантийный срок в порядке.");
    }
}
