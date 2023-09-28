package org.example;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human man = new Human("Александр");
        Human man1 = new Human("Володя");
        Human man2 = new Human("Тамара");
        Human man3 = new Human("Ольга");
        Human man4 = new Human("Валера");
        Human man5 = new Human("Полина");
        Human man6= new Human("Николай");
        Human man7 = new Human("Татьяна");

        market.acceptToMarket(man);
        market.acceptToMarket(man1);
        market.acceptToMarket(man2);
        market.acceptToMarket(man3);
        market.acceptToMarket(man4);
        market.acceptToMarket(man5);
        market.acceptToMarket(man6);
        market.acceptToMarket(man7);
        market.update();
    }
}
