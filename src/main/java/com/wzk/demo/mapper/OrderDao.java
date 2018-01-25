package com.wzk.demo.mapper;

import com.wzk.demo.pojo.Order;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface OrderDao {

	@Select("select id,name from t_order_0")
	public List<Order> getUserList();
}
