package org.example;

import java.util.List;

public interface Market {
    List<Goods> getGoods();

    void sell(String goodsId);
}
