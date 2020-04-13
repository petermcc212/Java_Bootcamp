package com.example.test;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.00, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket petersBasket = new Basket("peter");

        sellItem(petersBasket, "car", 1);
        System.out.println(petersBasket);

        sellItem(petersBasket, "car", 1);
        System.out.println(petersBasket);

        sellItem(petersBasket, "car", 1);
        sellItem(petersBasket, "spanner", 5);
//        System.out.println(petersBasket);

        sellItem(petersBasket, "juice", 4);
        sellItem(petersBasket, "cup", 12);
        sellItem(petersBasket, "bread", 1);
//        System.out.println(petersBasket);
        Basket basket = new Basket("custoemr");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(petersBasket, "car", 1);
        removeItem(petersBasket, "cup", 9);
        removeItem(petersBasket, "car", 1);
        System.out.println("cars removed: " + removeItem(petersBasket, "car", 1)); // should not remove any
        System.out.println(petersBasket);

        // remove all items from petersBasket
        removeItem(petersBasket, "breaad", 1);
        removeItem(petersBasket, "cup", 3);
        removeItem(petersBasket, "juice", 4);
        removeItem(petersBasket, "cup", 3);
        System.out.println(petersBasket);

        System.out.println("\n Display stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);


//        System.out.println(stockList);
//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);

        stockList.Items().get("car").adjustStock(2000);
        stockList.Items().get("car").adjustStock(-1000);
        System.out.println(stockList);
//        // immutable map
//        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()){
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        checkOut(petersBasket);
        System.out.println(petersBasket);
    }



    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }else{
            System.out.println("The item " + stockList.get(item) + " is out of stock");
        }
        return 0;

    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // retrieve item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }else{
            System.out.println("The item " + stockList.get(item) + " is out of stock");
        }
        return 0;

    }

    public static void checkOut (Basket basket){
        for(Map.Entry<StockItem, Integer> item: basket.items().entrySet()){
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
