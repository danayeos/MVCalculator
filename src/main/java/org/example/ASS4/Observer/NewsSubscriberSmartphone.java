public class NewsSubscriberSmartphone implements Observer {
    private String name;

    public NewsSubscriberSmartphone(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsCategory, String newsContent) {
        if (newsCategory.equals("Шоппинг")) {
            System.out.println(name + " (Смартфон) получил новость в категории 'Шоппинг': " + newsContent);
        }
    }
}
