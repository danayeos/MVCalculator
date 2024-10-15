
// Сенсор освещённости.
public class LightSensor implements Sensor {
    private HomeMediator mediator;
    private String data;

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
        mediator.registerSensor(this);
    }

    @Override
    public void updateData() {
        // Пример получения данных освещенности
        this.data = "300 Lux";
        System.out.println("Сенсор освещенности отправляет данные: " + data);
        mediator.setLightData(data);
    }

    @Override
    public String getData() {
        return data;
    }
}