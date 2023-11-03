public class GoodsTest {
    public static void main(String[] args) {
        GoodsManager goodsManager = new GoodsManager();

        System.out.println("第一次测试");
        goodsManager.addGood(new Goods("电视机"), "家电");
        goodsManager.show();
        printSeparateLine();

        String fruitCategory = "水果";

        System.out.println("第二次测试");
        goodsManager.addGoods(new Goods[]{new Goods("苹果"), new Goods("香蕉"), new Goods("葡萄")}, fruitCategory);
        goodsManager.show();
        printSeparateLine();

        System.out.println("第三次测试");
        goodsManager.addGood(new Goods("橘子"), fruitCategory);
        goodsManager.show();

        System.out.println("第四次测试");
        goodsManager.addGood(new Goods("牙刷"), "日用品");
        goodsManager.show();
        printSeparateLine();

        System.out.println("第五次测试,根据货物名称查找商品");
        for (String goodsName : new String[]{"电视机", "葡萄", "牙刷"}) {
            System.out.println(goodsManager.findByName(goodsName));
        }
    }

    private static void printSeparateLine() {
        System.out.println("**************");
    }
}
