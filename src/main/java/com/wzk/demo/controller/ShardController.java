package com.wzk.demo.controller;

import com.wzk.demo.pojo.Order;
import com.wzk.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShardController {

	@Autowired
	private OrderService orderService;

	@RequestMapping("userList")
	public List<Order> userList(){
		return orderService.getUserList();
	};

}
