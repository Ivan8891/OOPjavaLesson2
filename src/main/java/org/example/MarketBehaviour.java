package org.example;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket();
    void update();
}
