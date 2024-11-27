package com.devsuperior.desafio.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		if (order.getBasic() < 100) {
			return 20.0;
		}
		else if(order.getBasic() < 200) {
			return 12.0;
		}
		
		return 0.0;
	}
}
