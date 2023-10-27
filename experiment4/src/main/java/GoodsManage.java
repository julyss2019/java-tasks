public class GoodsManage {
    private final GoodsGroup[] goodsGroups = new GoodsGroup[2];

    public GoodsGroup findByCategory(String category) {
        for (GoodsGroup goodGroup : goodsGroups) {
            if (goodGroup == null) {
                return null;
            }

            if (goodGroup.getCatory().equals(category)) {
                return goodGroup;
            }
        }

        return null;
    }

    public Goods findByName(String name) {
        for (GoodsGroup goodGroup : goodsGroups) {
            if (goodGroup == null) {
                return null;
            }

            for (Goods goods : goodGroup.getGoodses()) {
                if (goods != null && goods.getName().equals(name)) {
                    return goods;
                }
            }
        }

        return null;
    }

    public void addGoods(Goods[] goodses, String category) {
        for (Goods goods : goodses) {
            addGood(goods, category);
        }
    }

    public void addGood(Goods goods, String category) {
        GoodsGroup goodsGroup = findByCategory(category);

        if (goodsGroup == null) {
            boolean isFull = true;

            for (int i = 0; i < goodsGroups.length; i++) {
                if (goodsGroups[i] == null) {
                    goodsGroups[i] = new GoodsGroup(category);
                    goodsGroup = goodsGroups[i];
                    isFull = false;
                    break;
                }
            }

            if (isFull) {
                System.out.println("货柜已满");
                return;
            }
        }

        goodsGroup.add(goods);
    }

    public void show() {
        for (GoodsGroup goodsGroup : goodsGroups) {
            if (goodsGroup != null) {
                System.out.printf("类别:%s,货物有: %n", goodsGroup.getCatory());
                goodsGroup.printAll();
            }
        }

        System.out.println("货物总库存 " + Goods.getNumber());
    }
}
