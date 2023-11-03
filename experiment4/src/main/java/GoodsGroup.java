public class GoodsGroup {
    private String category;
    private Goods[] goodses = new Goods[3];

    public GoodsGroup(String category) {
        this.category = category;
    }

    public void add(Goods goods) {
        for (int i = 0; i < goodses.length; i++) {
            if (goodses[i] == null) {
                goodses[i] = goods;
                return;
            }
        }

        System.out.println("货柜已满");
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setGoodses(Goods[] goodses) {
        this.goodses = goodses;
    }

    public String getCategory() {
        return category;
    }

    public Goods[] getGoodses() {
        return goodses;
    }

    public void printAll() {
        for (Goods goods : goodses) {
            if (goods != null) {
                System.out.println(goods);
            }
        }
    }
}
