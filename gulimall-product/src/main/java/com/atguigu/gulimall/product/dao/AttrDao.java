package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author zhangzhi
 * @email zhangzhi@gmail.com
 * @date 2020-06-14 08:39:59
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
