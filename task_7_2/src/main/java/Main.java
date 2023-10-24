public class Main {
    public static void main(String[] args) {
        GoodsManager goodsManager = new GoodsManager();

        goodsManager.addGoods(new Goods("G001", "苹果", 10));
        goodsManager.addGoods(new Goods("G002", "西瓜", 3));

        for (int i = 0; i < 11; i++) {
            goodsManager.sell("G001", 1);
        }

        goodsManager.sell("G002", 1);
    }
}
