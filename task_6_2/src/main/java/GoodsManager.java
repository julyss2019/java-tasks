import java.util.List;

interface GoodsManager {
    void addGoods(Goods goods);

    Goods getGoods(String id);

    void removeGoods(String id);

    List<Goods> getGoodses();

    List<Goods> getGoodsesByCategory(String category);
}
