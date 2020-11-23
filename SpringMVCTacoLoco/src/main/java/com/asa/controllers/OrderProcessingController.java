package com.asa.controllers;

import java.text.DecimalFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asa.model.Order;

@Controller
@RequestMapping(value = "/pages")
public class OrderProcessingController {

	@RequestMapping(value = "/postOrder", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody Order postOrderData(@RequestBody Order order) {
		
		int veggieTacos = order.getVeggieTacoQty();
		int chickenTacos = order.getChickenTacoQty();
		int beefTacos = order.getBeefTacoQty();
		int chorizoTacos = order.getChorizoTacoQty();
		
		int totalTacos = veggieTacos + chickenTacos + beefTacos + chorizoTacos;
		DecimalFormat df = new DecimalFormat("0.00");

		double cost = veggieTacos * 2.50;
		cost += chickenTacos * 3.00;
		cost += beefTacos * 3.00;
		cost += chorizoTacos * 3.50;
				
		if(totalTacos >= 4) {
			cost = cost * 0.8;
		}
		cost = Double.valueOf(df.format(cost));
		
		order.setOrderTotalCost(cost);
		return order;
	}
	
	
	@RequestMapping(value = "/addOrder")
	public String showOrderPage(){
		return "addOrder";
	}
			
}
