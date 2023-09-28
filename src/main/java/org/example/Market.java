package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{
    List <Actor> visitor = new ArrayList<>();
    Queue<Actor> que = new LinkedList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        visitor.add(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        que.add(actor);
    }

    @Override
    public void takeOrders() {
        for(Actor obj: que){
            obj.setMakeOrder();
            System.out.println(obj);
        }
    }

    @Override
    public void giveOrders() {
        for(Actor obj: que){
            obj.setTakeOrder();
            System.out.println(obj);
        }
    }

    @Override
    public void releaseFromQueue() {
        que.clear();
        System.out.println("Очередь пуста.");
    }

    @Override
    public void releaseFromMarket() {
        visitor.clear();
        System.out.println("Магазин пуст.");
    }

    @Override
    public void update() {
        System.out.println(listVisitorInfo(visitor));
        for(Actor obj: visitor){
            takeInQueue(obj);
        }
        System.out.println(queueVisitorInfo(que));
        takeOrders();
        System.out.println("Все заказы приняты.\nВыдача заказов.\n________________________________");
        giveOrders();
        System.out.println("Все заказы выданы.\n________________________________");
        releaseFromQueue();
        releaseFromMarket();
    }
    public String listVisitorInfo(List<Actor> actors){
        String txt="Посетители в магазине: \n";
        for(Actor obj: actors){
            txt+=obj.name.toString()+"\n";
        }
        txt+="________________________________";
        return txt;
    }
    public String queueVisitorInfo(Queue<Actor> actors){
        String txt="Посетители в очереди: \n";
        for(Actor obj: actors){
            txt+=obj.name.toString()+"\n";
        }
        txt+="________________________________";
        return txt;
    }

}
