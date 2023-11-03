public class Controller {
    private final TV tv;

    public Controller(TV tv) {
        this.tv = tv;
    }

    public void open() {
        tv.open();
    }

    public void close() {
        tv.close();
    }

    public void change(String channelName) {
        tv.change(channelName);
    }
}
