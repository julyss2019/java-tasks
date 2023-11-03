public class TVTest {
    public static void main(String[] args) {
        TV tv = new TV();
        Controller controller = new Controller(tv);

        controller.open();
        controller.change("CCTV1");
        controller.close();
        controller.change("CCTV3");
    }
}
