package com.balieiro.desafioComponentesInjecao.services;

import com.balieiro.desafioComponentesInjecao.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        //return (order.getBasic() < 100) ? 20d : (order.getBasic() < 200) ? 12d : 0d;
        if(order.getBasic() < 100){
            return order.getBasic() * ((100 - order.getDiscount()) / 100) + 20;
        } else if (order.getBasic() < 200) {
            return order.getBasic() * ((100 - order.getDiscount()) / 100) + 12;
        }else {
            return order.getBasic() * ((100 - order.getDiscount()) / 100);
        }

    }
}
