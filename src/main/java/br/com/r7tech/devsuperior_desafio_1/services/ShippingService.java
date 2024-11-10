package br.com.r7tech.devsuperior_desafio_1.services;

import br.com.r7tech.devsuperior_desafio_1.entities.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShippingService {

    public double shipment(Order order) {
        double shipment = 0;

        if(order.getBasic() < 100) {
            shipment = 20;
        } else if(order.getBasic() <= 200) {
            shipment = 12;
        }

        return shipment;
    }
}
