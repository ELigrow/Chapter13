package edu.wctc.command;

public class Main {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker sBroker = new Broker();
        sBroker.takeOrder(buyStockOrder);
        sBroker.takeOrder(sellStockOrder);

        sBroker.placeOrders();

        Broker cBroker = new Broker();

        CommodityFactory commodityFactory = new CommodityFactory();

        ICommodity wheat = commodityFactory.getCommodity(CommodityType.WHEAT);
        ICommodity beans = commodityFactory.getCommodity(CommodityType.BEANS);
        ICommodity corn = commodityFactory.getCommodity(CommodityType.CORN);

        BuyCommodity buyWheat = new BuyCommodity(wheat);
        BuyCommodity buyBeans = new BuyCommodity(beans);
        BuyCommodity buyCorn = new BuyCommodity(corn);

        SellCommodity sellWheat = new SellCommodity(wheat);
        SellCommodity sellBeans = new SellCommodity(beans);
        SellCommodity sellCorn = new SellCommodity(corn);

        sBroker.takeOrder(buyBeans);
        sBroker.takeOrder(buyCorn);
        sBroker.takeOrder(buyWheat);
        sBroker.takeOrder(sellBeans);
        sBroker.takeOrder(sellCorn);
        sBroker.takeOrder(sellWheat);

        sBroker.placeOrders();
    }

}
