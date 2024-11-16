package com.balieiro.desafioComponentesInjecao.services;

import com.balieiro.desafioComponentesInjecao.entities.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {

    private ShippingService shippingService;

    public double total(Order order) {

        return order.getBasic() * ((100 - order.getDiscount()) / 100) + shippingService.shipment(order);
    }
}
