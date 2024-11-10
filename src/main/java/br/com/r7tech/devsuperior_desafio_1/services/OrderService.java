package br.com.r7tech.devsuperior_desafio_1.services;

import br.com.r7tech.devsuperior_desafio_1.entities.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ShippingService shippingService;

    public double total(Order order) {
        double discountPercentage = order.getDiscount();

        double discountValue = (order.getBasic() * discountPercentage) / 100;

        return (order.getBasic() - discountValue) + shippingService.shipment(order);
    }
}
