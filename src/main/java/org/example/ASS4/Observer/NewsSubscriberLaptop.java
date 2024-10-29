public class NewsSubscriberLaptop implements Observer {
    private String name;

    public NewsSubscriberLaptop(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsCategory, String newsContent) {
        if (newsCategory.equals("Технологии")) {
            System.out.println(name + " (Ноутбук) получил новость в категории 'Технологии': " + newsContent);
        }
    }
}
