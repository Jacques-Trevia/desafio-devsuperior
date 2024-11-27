package com.devsuperior.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		
		double discountedPrice = order.getBasic() * Math.abs(1 - order.getDiscount()/100);
		
		return discountedPrice + shippingService.shipment(order);
	}
}
