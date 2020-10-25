package com.kodilla.good.patterns.order;

public class ProductOrderServiceApplication {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.orderRequestRetriever();
        ProductOrderService productOrderService = new ProductOrderService(new MessageSender(), new OrderManager(), new OrderList());
        productOrderService.process(orderRequest);
    }
}
