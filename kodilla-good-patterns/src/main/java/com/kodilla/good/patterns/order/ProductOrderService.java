package com.kodilla.good.patterns.order;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(OrderRequest orderRequest) {

        boolean orderConfirmed = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate(), orderRequest.getDeliveryOrder());
        if (orderConfirmed) {
            informationService.informUser(orderRequest.getUser());
            orderRepository.newOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate(), orderRequest.getDeliveryOrder());
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}

