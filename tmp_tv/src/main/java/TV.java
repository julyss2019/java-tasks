import java.util.Scanner;

public class TV {
    private final Scanner scanner = new Scanner(System.in);
    private boolean state;

    public boolean isOpened() {
        return state;
    }

    public void open() {
        if (!isOpened()) {
            System.out.println("电视机开了.");
            this.state = true;
        }
    }

    public void close() {
        if (isOpened()) {
            String action;

            while (true) {
                System.out.println("确定关闭电源？（确定Y/取消N）");

                action = scanner.next();

                if (action.equalsIgnoreCase("Y")) {
                    System.out.println("电视机关了.");
                    this.state = false;
                    return;
                } else if (action.equalsIgnoreCase("N")) {
                    System.out.println("已取消关机.");
                    return;
                } else {
                    System.out.println("输入错误.");
                }
            }
        }
    }

    public void change(String channelName) {
        if (isOpened()) {
            System.out.println("已切换到 " + channelName + " 频道.");
        }
    }
}
