package com.wzk.demo.service;


import com.wzk.demo.mapper.OrderDao;
import com.wzk.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService {

	@Autowired
	private OrderDao orderDao;


	public List<Order> getUserList() {
		return orderDao.getUserList();
	};
}
