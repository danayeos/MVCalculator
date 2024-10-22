// Класс для проверки качества продуктов питания
public class FoodQualityCheck extends QualityCheck {

    @Override
    protected void checkSpecificCharacteristics() {
        System.out.println("Проверка продуктов питания:");
        System.out.println("- Проверка срока годности: срок годности в норме.");
        System.out.println("- Проверка состава: состав соответствует стандартам.");
    }
}
