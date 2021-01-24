package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangzhi
 * @email zhangzhi@gmail.com
 * @date 2020-06-14 10:41:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
