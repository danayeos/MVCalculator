public class NewsSubscriberTablet implements Observer {
    private String name;

    public NewsSubscriberTablet(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsCategory, String newsContent) {
        System.out.println(name + " (Планшет) получил новость: " + newsContent + " в категории '" + newsCategory + "'");
    }
}
