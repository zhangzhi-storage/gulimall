package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangzhi
 * @email zhangzhi@gmail.com
 * @date 2020-06-14 11:12:12
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
