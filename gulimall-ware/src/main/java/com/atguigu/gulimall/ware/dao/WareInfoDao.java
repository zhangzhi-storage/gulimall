package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author zhangzhi
 * @email zhangzhi@gmail.com
 * @date 2020-06-14 11:39:40
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
