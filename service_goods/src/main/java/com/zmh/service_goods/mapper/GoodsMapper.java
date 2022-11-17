package com.zmh.service_goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zmh.service_goods.entry.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {


}
