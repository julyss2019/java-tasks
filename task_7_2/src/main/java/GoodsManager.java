import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GoodsManager {
    private final Map<String, Goods> goodsMap = new ConcurrentHashMap<>();

    public boolean sell(String id, int amount) {
        if (!existsGoods(id)) {
            System.out.println("商品不存在.");
            return false;
        }

        Goods goods = getGoods(id);

        if (goods.getAmount() - amount < 0) {
            System.out.printf("商品库存不足: %s.%n", goods.getName());
            return false;
        }

        goods.setAmount(goods.getAmount() - amount);
        System.out.printf("购买成功: %sx%d.%n", goods.getName(), amount);
        return true;
    }

    public boolean existsGoods(String id) {
        return goodsMap.containsKey(id);
    }

    public void addGoods(Goods goods) {
        goodsMap.put(goods.getId(), goods);
    }

    public Goods getGoods(String id) {
        return goodsMap.get(id);
    }

    public List<Goods> getGoodses() {
        return new ArrayList<>(goodsMap.values());
    }
}
