package com.prowings.shoppingcartapp.service;

import com.prowings.shoppingcartapp.model.dto.BillDTO;
import com.prowings.shoppingcartapp.model.dto.CartDTO;
import com.prowings.shoppingcartapp.model.dto.Item;

public interface CartService {

	public boolean addItemToCart(Item item);

	public BillDTO calculateBill();
	
	
	

}
